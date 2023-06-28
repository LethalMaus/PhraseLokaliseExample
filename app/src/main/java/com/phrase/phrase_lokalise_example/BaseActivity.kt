package com.phrase.phrase_lokalise_example

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.lokalise.sdk.LokaliseContextWrapper
import com.lokalise.sdk.LokaliseResources
import com.phrase.android.sdk.Phrase
import com.phrase.android.sdk.Phrase.getDelegate

open class BaseActivity : AppCompatActivity() {
    override fun getDelegate(): AppCompatDelegate {
        return getDelegate(this, super.getDelegate())
    }

    public override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LokaliseContextWrapper.wrap(newBase))
//        val lokaliseResources = LokaliseResources(newBase)
//        val myString: String = lokaliseResources.getString(R.string.hello_world)
    }
}