package com.appdev.jphil.basemvp.main

import android.os.Bundle
import com.appdev.jphil.basemvp.R
import com.appdev.jphil.basemvp.example.ExampleFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, ExampleFragment())
            .commit()
    }
}
