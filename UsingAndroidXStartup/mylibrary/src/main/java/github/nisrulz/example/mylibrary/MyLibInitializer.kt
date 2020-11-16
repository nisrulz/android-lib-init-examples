package github.nisrulz.example.mylibrary

import android.content.Context
import androidx.startup.Initializer

class MyLibInitializer : Initializer<MyLib> {
    override fun create(context: Context): MyLib {
        return MyLib.init(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
