package com.example.myapplication

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import java.util.*

class MainActivity : AppCompatActivity() {
    private var button : Button? = null
    private var editText : EditText? = null
    private var textView : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        textView?.append("onCreate \n")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        button = findViewById(R.id.button)
        editText = findViewById(R.id.editTextTextPersonName)
        textView = findViewById(R.id.textView)

        textView?.setText("")
        textView?.movementMethod = ScrollingMovementMethod()
        editText?.setText("")
        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView?.append("${editText?.text} \n")
                editText?.setText("")
            }
        })
       /* var palyer = Player("mahmod",25,5)
        var myList:ArrayList<String> = ArrayList();
        myList.add("dkmk")
        myList.removeIf { it.equals("dcdff") }
        palyer.show()
        Toast.makeText(this,palyer.toString(),Toast.LENGTH_LONG).show()
        for (i in 1..10){
            println(i)
        }

         for (i in 1 until 10){
            println(i)
        }

        for (i in 10 downTo 0 step 2){
            println(i)
        }*/
    }

    override fun onStart() {
        textView?.append("onStart \n")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        textView?.append("onStart \n")
        super.onRestoreInstanceState(savedInstanceState)
        textView?.setText(savedInstanceState.getString("value"))
    }

    override fun onResume() {
        textView?.append("onStart \n")
        super.onResume()
    }

    override fun onPause() {
        textView?.append("onStart \n")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        textView?.append("onStart \n")
        super.onSaveInstanceState(outState)
        outState?.putString("value", textView?.text.toString());
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }
}
