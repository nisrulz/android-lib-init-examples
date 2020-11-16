package github.nisrulz.example.mylibrary

class MyLib {
    private val startString = "Authorization: Bearer "
    private var authHeader = startString

    fun init(token: String) { changeToken(token) }

    fun changeToken(token: String) {
        authHeader = startString + token
    }

    fun getAuthHeader() = authHeader
}