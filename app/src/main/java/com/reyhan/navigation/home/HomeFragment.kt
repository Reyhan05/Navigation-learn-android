package com.reyhan.navigation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.reyhan.navigation.R


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.btnSecond)
        btn?.setOnClickListener{
            findNavController().navigate(R.id.secondFragment)
        }

       /* view.findViewById<Button>(R.id.btnThird)?.setOnClickListener {
            val flowStepNumberArgs = 1
            val action = HomeFragment.
        }*/

    }

}