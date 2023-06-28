package dev.jamescullimore.phrase_lokalise_example

import android.app.Application
import android.util.Log
import com.lokalise.sdk.Lokalise
import com.lokalise.sdk.LokaliseCallback
import com.lokalise.sdk.LokaliseUpdateError

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Lokalise.init(this, getString(R.string.lokalise_sdk_token), getString(R.string.lokalise_project_id))
        val myCallback: LokaliseCallback = object : LokaliseCallback {
            override fun onUpdated(oldBundleId: Long, newBundleId: Long) {
                Log.d("LOKALISE", "$oldBundleId -> $newBundleId")
            }

            override fun onUpdateFailed(error: LokaliseUpdateError) {
                Log.d("LOKALISE", error.toString())
            }

            override fun onUpdateNotNeeded() {
                Log.d("LOKALISE", "onUpdateNotNeeded")
            }
        }
        Lokalise.addCallback(myCallback)
        Lokalise.isPreRelease = true
        Lokalise.updateTranslations()
    }
}