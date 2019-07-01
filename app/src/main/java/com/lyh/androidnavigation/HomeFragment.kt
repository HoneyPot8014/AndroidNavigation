package com.lyh.androidnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class HomeFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    @SuppressLint("PrivateResource")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nextButton = view.findViewById<Button>(R.id.nav_next_home)
        val option = navOptions {
            anim {
                enter = R.anim.abc_slide_in_top
                exit = R.anim.abc_slide_out_bottom
                popEnter = R.anim.abc_slide_in_bottom
                popExit = R.anim.abc_slide_out_top
            }
        }
        nextButton?.setOnClickListener {
            //            Navigation.createNavigateOnClickListener(R.id.firstFragment)
            findNavController().navigate(R.id.firstFragment, null, option)
        }
    }
}
