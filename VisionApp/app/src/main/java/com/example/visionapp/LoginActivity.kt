package com.example.visionapp

import android.content.Intent
import android.view.View
import com.example.visionapp.bases.BaseActivity

class LoginActivity : BaseActivity(R.layout.activity_login) {


    override fun initViews() {

    }

    /**
     * This function allows take us to login specific view
     */
    protected fun loginView(){
    }

    /**
     * This function allows take us to register specific view
     */
    protected  fun registerView(view: View){
        val intent = Intent(this@LoginActivity,  RegisterActivity::class.java).
                     addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)

        startActivity(intent)
    }

}