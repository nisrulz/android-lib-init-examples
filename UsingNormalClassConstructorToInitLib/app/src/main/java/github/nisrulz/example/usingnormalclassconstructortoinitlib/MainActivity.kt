package github.nisrulz.example.usingnormalclassconstructortoinitlib

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import github.nisrulz.example.mylibrary.MyLib

class MainActivity : AppCompatActivity() {
    private lateinit var txtView: TextView
    private val myLib = MyLib("123")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()

        myLib.changeToken("456")
        txtView.text = myLib.getAuthHeader()
    }

    private fun setupView() {
        txtView = findViewById(R.id.txtView)
    }
}