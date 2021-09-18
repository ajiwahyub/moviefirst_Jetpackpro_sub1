package com.ajijetpackpro.moviefirst.viewmodel

import androidx.lifecycle.ViewModel
import com.ajijetpackpro.moviefirst.dummydata.MovieData
import com.ajijetpackpro.moviefirst.model.MovieList


class DetailViewModel: ViewModel() {

    private lateinit var movieId: String
    private lateinit var tvShowId: String


    fun setMovieId(movieId: String) {
        this.movieId = movieId
    }

    fun setTvShowId(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getMovieItems(): ArrayList<MovieList> = MovieData.getDummyMovie() as ArrayList<MovieList>

    fun getTvShowsItems(): ArrayList<MovieList> = MovieData.getDummyTvshows() as ArrayList<MovieList>

    fun getDetailMovieById(): MovieList {
        lateinit var detailItems: MovieList
        val listMovie = getMovieItems()
        val movie: MovieList? = listMovie.find { it.id == movieId   }
            detailItems = movie!!
            return detailItems
    }

    fun getDetailTvShowById(): MovieList {
        lateinit var detailItems: MovieList
        val listTvShow = getTvShowsItems()
        val tvShow: MovieList? = listTvShow.find { it.id == tvShowId   }
        detailItems = tvShow!!
        return detailItems
    }
}




