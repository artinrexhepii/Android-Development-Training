package com.tahirietrit.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanxceState: Bundle?
    ): View? {
        val v = inflater.inflate(
            R.layout.fragment_profile,
            container,
            false
        )
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ctx = requireActivity()

    }
}