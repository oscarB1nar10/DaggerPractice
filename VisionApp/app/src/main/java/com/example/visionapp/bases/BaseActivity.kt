package com.example.visionapp.bases

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import com.example.visionapp.R

abstract class BaseActivity(val layout: Int) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
    }

    override fun setContentView(layoutResID: Int) {
        var constraintLayout: ConstraintLayout = layoutInflater.inflate(R.layout.activity_base, null) as ConstraintLayout
        layoutInflater.inflate(layoutResID, constraintLayout, true)
        super.setContentView(constraintLayout)

    }

    abstract fun initViews()
}