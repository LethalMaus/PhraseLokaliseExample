package dev.jamescullimore.phrase_lokalise_example

import android.app.Application
import android.content.Context
import android.util.Log
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
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(Phrase.wrapApplicationContext(newBase))
    }
}