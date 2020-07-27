package com.lc.koin

import android.app.Application
import com.lc.koin.module.personModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 *@author LC
 *@createTime 2020/7/12 14:54
 *@description
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApplication)
            modules(personModule)

        }
    }
}