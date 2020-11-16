package github.nisrulz.example.mylibrary

class MyLib(token: String) {
    private val startString = "Authorization: Bearer "
    private var authHeader = startString

    init { changeToken(token) }

    fun changeToken(token: String) {
        authHeader = startString + token
    }

    fun getAuthHeader() = authHeader
}