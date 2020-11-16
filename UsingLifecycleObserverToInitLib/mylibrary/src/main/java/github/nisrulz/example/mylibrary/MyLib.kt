package github.nisrulz.example.mylibrary

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLib(private val token: String) : DefaultLifecycleObserver {
    private val startString = "Authorization: Bearer "
    private var authHeader = startString

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        changeToken(token)
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        reset()
    }

    fun changeToken(token: String) {
        authHeader = startString + token
    }

    fun reset() {
        authHeader = startString
    }

    fun getAuthHeader() = authHeader
}