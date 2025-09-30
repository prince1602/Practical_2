package com.example.practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showmeg("ON Create Call")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    fun showmeg(meg: String){
        Toast.makeText(this, "$meg", Toast.LENGTH_SHORT).show()
        Log.i(TAG,"Toast message show:$meg")
    }
    fun showSnackbar(message: String) {
        val rootView = findViewById<android.view.View>(R.id.main)
        Snackbar.make(rootView, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showmeg("ON Start Call")
        showSnackbar("On Start Call")
    }

    override fun onResume() {
        super.onResume()
        showmeg("On Resume Call")
        showSnackbar("On Resume Call")
    }

    override fun onPause() {
        super.onPause()
        showmeg("On pause Call")
        showSnackbar("On Pause Call")
    }

    override fun onStop() {
        super.onStop()
        showmeg("on Stop Call")
        showSnackbar("On Stop Call")
    }
    override fun onRestart() {
        super.onRestart()
        showmeg("On Restart Call")
        showSnackbar("On Restart Call")
    }

    override fun onDestroy() {
        super.onDestroy()
        showmeg("On Destroy Call")
        showSnackbar("On Destroy Call")
    }

}