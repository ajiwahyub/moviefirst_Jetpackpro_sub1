package com.ajijetpackpro.moviefirst.viewmodel

import androidx.lifecycle.ViewModel
import com.ajijetpackpro.moviefirst.dummydata.MovieData
import com.ajijetpackpro.moviefirst.model.MovieList

class ListviewViewModel: ViewModel() {

    fun getMovies(): List<MovieList> = MovieData.getDummyMovie()
    fun getTvShows(): List<MovieList> = MovieData.getDummyTvshows()

}
