package com.example.find_it_cources.presentation

import android.app.Application
import com.example.data.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CoursesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CoursesApp)
            modules(dataModule)
        }
    }
}
