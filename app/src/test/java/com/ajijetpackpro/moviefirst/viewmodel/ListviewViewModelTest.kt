package com.ajijetpackpro.moviefirst.viewmodel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class ListviewViewModelTest {

    private lateinit var viewModel : ListviewViewModel

    @Before
    fun setUp(){
        viewModel = ListviewViewModel()
    }

    @Test
    fun getMovies() {
        val courseEntities = (viewModel.getMovies())
        assertNotNull(courseEntities)
        assertEquals(10, courseEntities.size)
    }

    @Test
    fun getTvShows() {
        val courseEntities = (viewModel.getTvShows())
        assertNotNull(courseEntities)
        assertEquals(10, courseEntities.size)
    }
}