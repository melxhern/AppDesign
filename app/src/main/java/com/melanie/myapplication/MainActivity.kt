package com.melanie.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onWatchClicked(view: View) {
        val intent = Intent(this, WatchPage::class.java)

        // Id of the watch chosen
        val clickedWatchId = view.id

        // Put the id as extra info to the intent
        intent.putExtra("watch_id", clickedWatchId)

        startActivity(intent)
    }


}