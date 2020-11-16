package github.nisrulz.example.mylibrary

import android.content.Context

object MyLib {
    private var startString: String = ""
    private var authHeader = startString

    fun init(context: Context?) {
        startString = context?.getString(R.string.starting_string) ?: ""
    }

    fun changeToken(token: String) {
        authHeader = "$startString $token"
    }

    fun getAuthHeader() = authHeader
}