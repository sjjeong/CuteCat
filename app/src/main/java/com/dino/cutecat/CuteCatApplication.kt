package com.dino.cutecat

import android.app.Application
import com.dino.cutecat.di.remoteModule
import com.dino.cutecat.di.viewModelModule
import com.dino.library.di.getDinoNetworkModule
import com.dino.library.ext.setupKoin

class CuteCatApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin(
            this,
            getDinoNetworkModule("https://api.thecatapi.com/"),
            viewModelModule,
            remoteModule
        )
    }

}