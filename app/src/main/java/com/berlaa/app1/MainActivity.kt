package com.berlaa.app1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

//    lateinit var helloTextView: TextView
//    lateinit var newTextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("TAG", "onCreate")
    }

//    fun newNextButtonClick() {
//        newTextButton.setOnClickListener {
//            //helloTextView.text = Random.nextInt().toString()
//            Toast.makeText(this, "Hi!!!", Toast.LENGTH_SHORT).show()
//        }
//    }

    override fun onStart() {
        super.onStart()
        Log.i("TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TAG", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TAG", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TAG", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TAG", "onDestroy")
    }
}