package com.example.covaxspotter.ui.vaccines

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.covaxspotter.databinding.FragmentPfizerBinding
import com.example.covaxspotter.utils.pfizer

class PfizerFragment : Fragment() {
    private var _binding: FragmentPfizerBinding ?= null // backing property
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment bind it to binding
        _binding = FragmentPfizerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.PfizerText.text = pfizer
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null //release memory at the end of lifecycle
    }

}
