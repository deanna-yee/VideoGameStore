package com.udacity.shoestore.videogamelist

import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.VideoGame

class VideoGamesViewModel : ViewModel() {

    private val _videoGamesList = MutableLiveData<MutableList<VideoGame>>()
    val videoGamesList : LiveData<MutableList<VideoGame>>
    get() = _videoGamesList

    val nameText = MutableLiveData<String>()
    val companyText = MutableLiveData<String>()
    val descriptionText = MutableLiveData<String>()


    fun addVideoGame(){
        val tempVideoGamesList = _videoGamesList.value ?: mutableListOf()
        //val videoGame = VideoGame()
        //tempVideoGamesList.add(videoGame)

        _videoGamesList.value = tempVideoGamesList
    }


}