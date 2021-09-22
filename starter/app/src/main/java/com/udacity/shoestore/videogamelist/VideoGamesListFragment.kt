package com.udacity.shoestore.videogamelist

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentVideogamesListBinding

class VideoGamesListFragment : Fragment() {
    private lateinit var binding: FragmentVideogamesListBinding
    private lateinit var viewModel: VideoGamesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        viewModel = ViewModelProvider(requireActivity()).get(VideoGamesViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_videogames_list,
        container, false)
        binding.addButton.setOnClickListener {  view: View ->
            view.findNavController().navigate(VideoGamesListFragmentDirections.addVideogame())
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.logout -> {
                findNavController().navigate(VideoGamesListFragmentDirections.actionLogout())
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}