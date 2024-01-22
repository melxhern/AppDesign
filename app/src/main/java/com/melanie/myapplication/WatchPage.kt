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

        // Récupérez l'ID du titre à partir de l'intention
        val clickedWatchId = intent.getIntExtra("watch_id", 0)

        // Utilisez l'ID du titre pour mapper les détails correspondants
        when (clickedWatchId) {
            R.id.watch_1 -> {
                // Modifiez les détails dans votre mise en page en fonction de l'ID du titre
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.series_7_zoom)

                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_1)

                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_apple)

                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_1)

                // Ajoutez d'autres modifications en fonction de l'ID du titre
            }
            R.id.watch_2 -> {
                // Modifiez les détails dans votre mise en page en fonction de l'ID du titre
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.series_4_zoom)

                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_2)

                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_galaxy)

                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_2)
                // Ajoutez d'autres modifications en fonction de l'ID du titre
            }
            R.id.watch_3 -> {
                // Modifiez les détails dans votre mise en page en fonction de l'ID du titre
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.mi_watch_zoom)

                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_3)

                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_mi)

                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_3)
                // Ajoutez d'autres modifications en fonction de l'ID du titre
            }
            R.id.watch_4 -> {
                // Modifiez les détails dans votre mise en page en fonction de l'ID du titre
                val watchImageView = findViewById<ImageView>(R.id.imageView)
                watchImageView.setImageResource(R.drawable.amazfit_zoom)

                val watchTitleTextView = findViewById<TextView>(R.id.title)
                watchTitleTextView.text = getString(R.string.title_watch_4)

                val watchPriceTextView = findViewById<TextView>(R.id.price_view)
                watchPriceTextView.text = getString(R.string.price_amazon)

                val watchDescriptionTextView = findViewById<TextView>(R.id.description_text)
                watchDescriptionTextView.text = getString(R.string.desc_4)
                // Ajoutez d'autres modifications en fonction de l'ID du titre
            }
            // Ajoutez d'autres cas en fonction des IDs des titres
        }
    }

    fun onButtonClicked(view: View) {
        // Appel à la méthode finish() pour fermer l'activité actuelle et revenir à l'activité précédente (MainActivity)
        finish()
    }
}
