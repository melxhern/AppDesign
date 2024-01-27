package com.melanie.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class WatchPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.watch_page)

        // Take the id from the info in the intent
        val clickedWatchId = intent.getIntExtra("watch_id", 0)

        // Modify the page depending on the id received
        when (clickedWatchId) {
            R.id.watch_1 -> {
                // Change the image
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.series_7_zoom)

                // Change the title
                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_1)

                // Change the price
                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_apple)

                // Change the description
                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_1)

            }
            R.id.watch_2 -> {
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.series_4_zoom)

                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_2)

                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_galaxy)

                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_2)
            }
            R.id.watch_3 -> {
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.mi_watch_zoom)

                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_3)

                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_mi)

                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_3)
            }
            R.id.watch_4 -> {
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.amazfit_zoom)

                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_4)

                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_amazon)

                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_4)
            }
        }
    }

    // Go back to MainActivity
    fun onButtonClicked(view: View) {
        finish()
    }
}
