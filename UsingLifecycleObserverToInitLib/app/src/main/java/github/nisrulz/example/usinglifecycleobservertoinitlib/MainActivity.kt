package github.nisrulz.example.usinglifecycleobservertoinitlib

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
    }

    override fun onResume() {
        super.onResume()
        myLib.changeToken("456")
        txtView.text = myLib.getAuthHeader()
    }

    override fun onStart() {
        super.onStart()
        // Add lifecycle observer
        lifecycle.addObserver(myLib)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Remove lifecycle observer
        lifecycle.removeObserver(myLib)
    }

    private fun setupView() {
        txtView = findViewById(R.id.txtView)
    }
}