package com.mbl.bottomnavigationexercise_v1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.mbl.bottomnavigationexercise_v1.databinding.ActivityMainBinding
import com.mbl.bottomnavigationexercise_v1.fragments.FavFragment
import com.mbl.bottomnavigationexercise_v1.fragments.HomeFragment
import com.mbl.bottomnavigationexercise_v1.fragments.SearchFragment
import com.mbl.bottomnavigationexercise_v1.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.settings -> replaceFragment(SettingsFragment())
                R.id.favourites -> replaceFragment(FavFragment())
                R.id.search -> replaceFragment(SearchFragment())
                else -> { }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }



}