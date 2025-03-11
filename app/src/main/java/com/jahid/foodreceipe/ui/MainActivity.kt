package com.jahid.foodreceipe.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.jahid.foodreceipe.R
import com.jahid.foodreceipe.ui.fragment.recipes.ReceipeFragment
import com.jahid.foodreceipe.ui.fragment.saved.SaveFragment
import com.jahid.foodreceipe.ui.fragment.tips.TipsFragment
import com.jahid.foodreceipe.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentReplace(ReceipeFragment())
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.receipeFragment -> {
                    fragmentReplace(ReceipeFragment())
                    true
                }

                R.id.saveFragment -> {
                    fragmentReplace(SaveFragment())
                    true
                }

                R.id.foodTipsFragment -> {
                    fragmentReplace(TipsFragment())
                    true
                }

                else -> false
            }
        }

    }

    private fun fragmentReplace(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit()
    }
}