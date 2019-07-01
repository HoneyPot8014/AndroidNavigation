package com.lyh.androidnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav_next_first_fragment.setOnClickListener {
            val toSecondFragmentArgument = et_first_arg.text.toString()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            action.secondFragmentArgument = toSecondFragmentArgument
            findNavController().navigate(action)
        }

//        val firstFragmentString = arguments?.getString("firstFragment")

        val safeArgs: FirstFragmentArgs by navArgs()
        val firstFragmentString = safeArgs.firstFragmentArgument
        tv_first_arg.text = firstFragmentString

    }
}
