package com.socialmedia.devslopesprofile2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BasicActivity : AppCompatActivity() {
    val Tag = "Application Life Cycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Tag,"${javaClass.simpleName} Sudaiz i am now in onCreate method" )
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(Tag,"${javaClass.simpleName} Sudaiz am now in onStart method" )
        super.onStart()
    }

    override fun onResume() {
        Log.d(Tag,"${javaClass.simpleName} Sudaiz i am now in onResume method" )
        super.onResume()
    }

    override fun onRestart() {
        Log.d(Tag,"${javaClass.simpleName} Sudaiz i am now in onRestart method" )
        super.onRestart()
    }

    override fun onPause() {
        Log.d(Tag,"${javaClass.simpleName} Sudaiz i am now in onPause method" )
        super.onPause()
    }

    override fun onStop() {
        Log.d(Tag,"${javaClass.simpleName} Sudaiz i am now in onStop method" )
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Tag,"${javaClass.simpleName} Sudaiz i have finally destroy your Application" )
        super.onDestroy()
    }
}