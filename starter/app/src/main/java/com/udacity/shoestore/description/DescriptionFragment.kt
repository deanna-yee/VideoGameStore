package com.udacity.shoestore.description

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDescriptionBinding
import com.udacity.shoestore.videogamelist.VideoGamesViewModel

class DescriptionFragment : Fragment() {
    private lateinit var binding: FragmentDescriptionBinding
    private lateinit var viewModel: VideoGamesViewModel
    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_description,
                                        container, false)
        viewModel = ViewModelProvider(requireActivity()).get(VideoGamesViewModel::class.java)
        binding.videoGameViewModel = viewModel
        binding.lifecycleOwner = this

        binding.cancel.setOnClickListener { view:View ->
            gotoVideoGameList(view)
        }
        binding.save.setOnClickListener { view:View ->
           gotoVideoGameList(view)
        }
        return binding.root
    }

    private fun gotoVideoGameList(view:View){
        view.findNavController().navigate(DescriptionFragmentDirections.actionToVideogameList())
    }
}