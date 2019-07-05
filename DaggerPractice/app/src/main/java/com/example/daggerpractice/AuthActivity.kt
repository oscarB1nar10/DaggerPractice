package com.example.daggerpractice

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject
import kotlin.properties.Delegates

class AuthActivity : DaggerAppCompatActivity(){
    private val TAG = "AuthActivity"

    @Inject
    lateinit var logo: Drawable
    @Inject
    lateinit var requestManager: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setLogo()
    }

    private fun setLogo(){
        requestManager.
                load(logo)
                .into(login_logo)
    }

}