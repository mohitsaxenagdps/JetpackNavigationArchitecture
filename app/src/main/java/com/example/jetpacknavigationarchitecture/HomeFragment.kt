package com.example.jetpacknavigationarchitecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.jetpacknavigationarchitecture.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.btSignUp.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_signUpFragment)
        }

        binding.btTerms.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_termsFragment)
        }

        return binding.root
    }
}