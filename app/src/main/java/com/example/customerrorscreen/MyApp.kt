package com.example.customerrorscreen

import android.app.Application
import cat.ereza.customactivityoncrash.config.CaocConfig


/**
 * Created by  Mustufa on 04/11/2020.
 * Email : mustufaayub82@gmail.com
 */
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        CaocConfig.Builder.create()
            .trackActivities(true)
            .errorActivity(ErrorActivity::class.java)
            .apply()
    }
}