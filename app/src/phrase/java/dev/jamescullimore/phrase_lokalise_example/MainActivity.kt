package dev.jamescullimore.phrase_lokalise_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.phrase.android.sdk.Phrase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getDelegate(): AppCompatDelegate {
        return Phrase.getDelegate(this, super.getDelegate())
    }
}