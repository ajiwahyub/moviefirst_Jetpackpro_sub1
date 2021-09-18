package com.ajijetpackpro.moviefirst.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieList(

    var title: String,
    var userScore: Double,
    var overview: String,
    var id: String,
    var realeaseDate: String,
    var genre: String,
    var poster: Int,
    var background: Int
) : Parcelable

