package com.example.customerrorscreen

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import cat.ereza.customactivityoncrash.CustomActivityOnCrash
import kotlinx.android.synthetic.main.activity_error.*

class ErrorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)


        /** you can log the reason of crash by adding this line of code
         *  CustomActivityOnCrash.getStackTraceFromIntent(intent)
         */

        //getting crashing intent
        val config = CustomActivityOnCrash.getConfigFromIntent(intent)

        if (config == null) {
            finish()
            return
        }

        if (config.isShowRestartButton && config.restartActivityClass != null) {
            restartApp.text = "Restart App"
            restartApp.setOnClickListener {
                CustomActivityOnCrash.restartApplication(
                    this,
                    config
                )
            }
        } else {
            restartApp.text = "Close App"
            restartApp.setOnClickListener {
                CustomActivityOnCrash.closeApplication(
                    this,
                    config
                )
            }
        }

    }
}