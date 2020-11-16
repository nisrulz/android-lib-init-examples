package github.nisrulz.example.mylibrary

import android.content.Context

object MyLib {
    private var startString: String = ""
    private var authHeader = startString

    fun init(context: Context?): MyLib {
        startString = context?.getString(R.string.starting_string) ?: ""
        return this
    }

    fun changeToken(token: String) {
        authHeader = "$startString $token"
    }

    fun getAuthHeader() = authHeader
}