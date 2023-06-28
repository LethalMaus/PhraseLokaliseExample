package com.phrase.phrase_lokalise_example

import android.app.Application
import android.content.Context
import android.util.Log
import com.lokalise.sdk.Lokalise
import com.lokalise.sdk.LokaliseCallback
import com.lokalise.sdk.LokaliseUpdateError
import com.phrase.android.sdk.Phrase
import com.phrase.android.sdk.TranslationsSyncCallback

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Phrase.setup(this, "", "")
        //Phrase.setAppVersion() // not following version semantics can cause problems
        Phrase.updateTranslations(object : TranslationsSyncCallback {
            override fun onSuccess(translationsChanged: Boolean) {
                Log.d("PHRASE", "$translationsChanged")
            }

            override fun onFailure() {
                Log.d("PHRASE", "onFailure")
            }
        })

        Lokalise.init(this, "", "")
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
        //Lokalise.isPreRelease = true
        Lokalise.updateTranslations()
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(Phrase.wrapApplicationContext(newBase))
    }
}