package github.nisrulz.example.applicationclassinitvscontentproviderinit

import android.app.Application
import android.util.Log

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Log.d("LogTag", "onCreate called from Application class!")
    }
}