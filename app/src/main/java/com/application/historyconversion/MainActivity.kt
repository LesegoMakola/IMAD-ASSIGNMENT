package com.application.historyconversion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Code attribution
        //This method was taken from stackoverflow
        //https://stackoverflow.com/questions/14685790/how-to-make-a-button-redirect-to-another-xml-layout
        //GrIsHu
        //https://stackoverflow.com/users/1839336/grishu






        val btnstart=findViewById<Button>(R.id.Start)

        btnstart.setOnClickListener {
            val intent=Intent(this,Majorpage::class.java)
            startActivity(intent)
        }






    }





}