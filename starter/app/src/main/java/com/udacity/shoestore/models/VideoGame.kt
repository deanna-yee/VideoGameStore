package com.udacity.shoestore.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class VideoGame(var name: String, var company: String, var description: String) : Parcelable