package app.akilesh.qacc.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import app.akilesh.qacc.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.topjohnwu.superuser.Shell

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Try to get root access
        Shell.su().exec()

        if (!Shell.rootAccess()) {
            Log.e("ACC-SU", "Unable to get root access")
            /* Possible scenarios:
             * The user might not have granted access
             * User manually denied access in Magisk manager
             * Device is not rooted
             */
            MaterialAlertDialogBuilder(this)
                .setTitle(getString(R.string.no_root_access_title))
                .setMessage(getString(R.string.no_root_access_message))
                .setCancelable(false)
                .setNegativeButton(getString(R.string.exit)) { _, _ ->
                    finish()
                }
                .create()
                .show()
        }
        else {
            //Detect Magisk
            val result = Shell.su("[ -d /data/adb/magisk ]").exec()
            if (result.isSuccess) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else {
                MaterialAlertDialogBuilder(this)
                    .setTitle(getString(R.string.magisk_not_detected))
                    .setCancelable(false)
                    .setNegativeButton(getString(R.string.exit)) { _, _ ->
                        finish()
                    }
                    .create()
                    .show()
            }
        }
    }
}