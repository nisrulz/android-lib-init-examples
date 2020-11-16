package github.nisrulz.example.usingnormalclassinitfntoinitlib

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import github.nisrulz.example.mylibrary.MyLib

class MainActivity : AppCompatActivity() {
    private lateinit var txtView: TextView
    private val myLib = MyLib()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLib.init("123")
        myLib.changeToken("456")
        txtView.text = myLib.getAuthHeader()
    }

    private fun setupView() {
        txtView = findViewById(R.id.txtView)
    }
}