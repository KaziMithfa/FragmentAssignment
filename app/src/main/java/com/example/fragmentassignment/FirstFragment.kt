package com.example.fragmentassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentassignment.databinding.FragmentFirstBinding


private const val Alphabet = "alphabet"

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)


        val value = arguments?.getString("name")
        binding.alphabet.setText(value)
        return binding.root
    }

}