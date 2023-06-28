package dev.jamescullimore.phrase_lokalise_example

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lokalise.sdk.LokaliseContextWrapper
import com.lokalise.sdk.LokaliseResources

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LokaliseContextWrapper.wrap(newBase))
        val lokaliseResources = LokaliseResources(newBase)
        lokaliseResources.getString(R.string.hello_world)
    }
}