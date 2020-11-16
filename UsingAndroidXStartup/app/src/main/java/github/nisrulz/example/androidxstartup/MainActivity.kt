package github.nisrulz.example.androidxstartup

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import github.nisrulz.example.mylibrary.MyLib

class MainActivity : AppCompatActivity() {
    private lateinit var txtView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()

        // Init
        MyLib.changeToken("123")

        // Change
        MyLib.changeToken("456")
        txtView.text = MyLib.getAuthHeader()
    }

    private fun setupView() {
        txtView = findViewById(R.id.txtView)
    }
}