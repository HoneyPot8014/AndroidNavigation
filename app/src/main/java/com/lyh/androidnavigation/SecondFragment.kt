package com.lyh.androidnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav_next_to_home.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_homeFragment)
        }

        val safeArgs : SecondFragmentArgs by navArgs()
        val secondArgument = safeArgs.secondFragmentArgument
        tv_second_args.text = secondArgument
    }
}
