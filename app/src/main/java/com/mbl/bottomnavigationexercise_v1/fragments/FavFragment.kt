package com.mbl.bottomnavigationexercise_v1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mbl.bottomnavigationexercise_v1.R
import com.mbl.bottomnavigationexercise_v1.databinding.FragmentFavBinding

class FavFragment : Fragment() {
    private lateinit var binding: FragmentFavBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFavBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView2.text = "Ordamısın ? "
    }

}