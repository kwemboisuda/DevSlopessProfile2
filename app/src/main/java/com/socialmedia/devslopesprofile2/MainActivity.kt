package com.socialmedia.devslopesprofile2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val getStartedBtn=findViewById<Button>(R.id.getStartedBtn)
        getStartedBtn.setOnClickListener{
            val leagueActivityIntent= Intent(this,LeagueActivity::class.java)
            startActivity(leagueActivityIntent)
        }


    }
}