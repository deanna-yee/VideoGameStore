package com.udacity.shoestore.videogamelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.VideoGame

class VideoGamesViewModel : ViewModel() {

    private val _videoGamesList = MutableLiveData<MutableList<VideoGame>>()
    val videoGamesList : LiveData<MutableList<VideoGame>>
    get() = _videoGamesList

    fun addVideoGame(videoGame : VideoGame?){
        val tempVideoGamesList = _videoGamesList.value ?: mutableListOf()
        videoGame?.let {    videoGame:VideoGame ->
            tempVideoGamesList.add(videoGame)
        }
        _videoGamesList.value = tempVideoGamesList
    }
}