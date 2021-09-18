package com.ajijetpackpro.moviefirst

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ajijetpackpro.moviefirst.adapter.ListviewAdapter
import com.ajijetpackpro.moviefirst.model.MovieList
import com.ajijetpackpro.moviefirst.viewmodel.ListviewViewModel
import kotlinx.android.synthetic.main.fragment_tvshow.*

class TvshowFragment : Fragment() {

    private var tvshows: ArrayList<MovieList> = ArrayList()
    private lateinit var adapter: ListviewAdapter
    private lateinit var mainViewModel: ListviewViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        getTvshowList()
    }

    private fun setRecyclerView() {
        adapter = ListviewAdapter(tvshows)
        adapter.notifyDataSetChanged()
        recycleViewTvshow.layoutManager = LinearLayoutManager(activity)
        recycleViewTvshow.adapter = adapter
    }
    private fun getTvshowList() {

        mainViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            ListviewViewModel::class.java)
        val listTvshow = mainViewModel.getTvShows()
        adapter.setData(listTvshow as ArrayList<MovieList>)

        adapter.setOnItemClickCallback(object : ListviewAdapter.OnItemClickCallback{
            override fun onItemClicked(data: MovieList) = setSelectedTvshow(data)
        })
    }
    private fun setSelectedTvshow(tvshows: MovieList) {

        val move = Intent(context, DetailActivity::class.java)
        move.putExtra(DetailActivity.PUT_EXTRA, tvshows.id)
        startActivity(move)
    }


}