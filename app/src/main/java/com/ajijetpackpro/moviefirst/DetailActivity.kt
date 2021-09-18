package com.ajijetpackpro.moviefirst

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.ViewModelProvider
import com.ajijetpackpro.moviefirst.model.MovieList
import com.ajijetpackpro.moviefirst.viewmodel.DetailViewModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private lateinit var detailViewModel: DetailViewModel
    private lateinit var detailContent: MovieList
    private var titleApp = "Movie First"


    companion object {
        const  val PUT_EXTRA = "put_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBar(titleApp)

        detailViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailViewModel::class.java)
        val id = intent.getStringExtra(PUT_EXTRA)
        val i = id?.toInt()

        if (i!! <= 10) {
            detailViewModel.setMovieId(id)
            detailContent = detailViewModel.getDetailMovieById()
            showDetail()
        }
        else {
            detailViewModel.setTvShowId(id)
            detailContent = detailViewModel.getDetailTvShowById()
            showDetail()
        }

    }

    private fun showDetail() {
        tv_detail_title.text = detailContent.title
        tv_detail_overview.text = detailContent.overview
        tv_detail_rdate.text = detailContent.realeaseDate
        tv_detail_genre.text = detailContent.genre
        tv_detail_userscore.text = detailContent.userScore.toString()
        Glide.with(this).clear(iv_detail_poster)
        Glide.with(this).load(detailContent.poster).into(iv_detail_poster)
        Glide.with(this).clear(iv_detail_bg)
        Glide.with(this).load(detailContent.background).into(iv_detail_bg)
    }

    private fun setActionBar(titleApp: String) {
        val icon = ResourcesCompat.getDrawable(resources, R.drawable.ic_tmdb, null)?.toBitmap()
        val fixedIcon = BitmapDrawable(resources,
            icon.let { Bitmap.createScaledBitmap(it!!, 60, 60, true) })
        supportActionBar?.setHomeAsUpIndicator(fixedIcon)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = titleApp
        }
    }

}