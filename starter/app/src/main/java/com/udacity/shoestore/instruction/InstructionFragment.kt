package com.udacity.shoestore.instruction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionBinding

class InstructionFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding: FragmentInstructionBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_instruction, container, false)

        binding.goToVideoGameList.setOnClickListener { view: View ->
            view.findNavController().navigate(InstructionFragmentDirections.actionInstructionToVideogamelist())
        }
        return binding.root
    }
}