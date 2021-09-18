package com.ajijetpackpro.moviefirst.viewmodel

import com.ajijetpackpro.moviefirst.dummydata.MovieData
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailViewModelTest {
    private lateinit var detailViewModel: DetailViewModel
    private val dummyMovie = MovieData.getDummyMovie()[0]
    private val dummyTv = MovieData.getDummyTvshows()[0]
    private val movieId = dummyMovie.id
    private val tvId = dummyTv.id

    @Before
    fun setUp() {
        detailViewModel = DetailViewModel()
        detailViewModel.setMovieId(movieId)
        detailViewModel.setTvShowId(tvId)
    }

    @Test
    fun getDetailTvShowById() {
        val tv = detailViewModel.getDetailTvShowById()
        assertNotNull(tv)
        assertEquals(dummyTv.title, tv.title)
        assertEquals(dummyTv.overview, tv.overview)
        assertEquals(dummyTv.genre, tv.genre)
        assertEquals(dummyTv.realeaseDate, tv.realeaseDate)
        assertEquals(dummyTv.poster, tv.poster)
        assertEquals(dummyTv.background, tv.background)
        assertEquals(dummyTv.userScore.toString(), tv.userScore.toString())
        assertEquals(dummyTv.id, tv.id)
    }

    @Test
    fun getDetailMovieById() {
        val movie = detailViewModel.getDetailMovieById()
        assertNotNull(movie)
        assertEquals(dummyMovie.title, movie.title)
        assertEquals(dummyMovie.overview, movie.overview)
        assertEquals(dummyMovie.genre, movie.genre)
        assertEquals(dummyMovie.realeaseDate, movie.realeaseDate)
        assertEquals(dummyMovie.poster, movie.poster)
        assertEquals(dummyMovie.background, movie.background)
        assertEquals(dummyMovie.userScore.toString(), movie.userScore.toString())
        assertEquals(dummyMovie.id, movie.id)
    }
    @Test
    fun getMovieItems() {
        val movieList = detailViewModel.getMovieItems()
        assertNotNull(movieList)
        assertEquals(movieList.size, 10)

    }
    @Test
    fun getTvShowsItems() {
        val tvList = detailViewModel.getTvShowsItems()
        assertNotNull(tvList)
        assertEquals(tvList.size, 10)

    }
    @Test
    fun setMovieId(){
        val movieIdent = detailViewModel.setMovieId(movieId)
        assertNotNull(movieIdent)
    }

    @Test
    fun setTvShowId(){
        val tvIdent = detailViewModel.setTvShowId(tvId)
        assertNotNull(tvIdent)
    }
}