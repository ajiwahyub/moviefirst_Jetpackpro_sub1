package com.ajijetpackpro.moviefirst

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.ajijetpackpro.moviefirst.dummydata.MovieData
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    private val movieDummy = MovieData.getDummyMovie()

    private val tvshowDummy = MovieData.getDummyTvshows()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie(){
        Espresso.onView(withId(R.id.recycleViewMovie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.recycleViewMovie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movieDummy.size))
    }

    @Test
    fun loadTvshow(){
        Espresso.onView(withText(R.string.tabtvshos)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.recycleViewTvshow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.recycleViewTvshow))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvshowDummy.size))
    }

    @Test
    fun loadDetailMovie() {
        Espresso.onView(withId(R.id.recycleViewMovie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            ViewActions.click()
        ))
        Espresso.onView(withId(R.id.tv_detail_title))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_title))
            .check(ViewAssertions.matches(withText(movieDummy[0].title)))
        Espresso.onView(withId(R.id.tv_detail_genre))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_genre))
            .check(ViewAssertions.matches(withText(movieDummy[0].genre)))
        Espresso.onView(withId(R.id.tv_detail_overview))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_overview))
            .check(ViewAssertions.matches(withText(movieDummy[0].overview)))
        Espresso.onView(withId(R.id.tv_detail_userscore))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_userscore))
            .check(ViewAssertions.matches(withText(movieDummy[0].userScore.toString())))
        Espresso.onView(withId(R.id.tv_detail_rdate))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_rdate))
            .check(ViewAssertions.matches(withText(movieDummy[0].realeaseDate)))
        Espresso.onView(withId(R.id.iv_detail_bg))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.iv_detail_poster))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun loadDetailTvshow() {
        Espresso.onView(withText(R.string.tabtvshos)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.recycleViewTvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            ViewActions.click()
        ))
        Espresso.onView(withId(R.id.tv_detail_title))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_title))
            .check(ViewAssertions.matches(withText(tvshowDummy[0].title)))
        Espresso.onView(withId(R.id.tv_detail_genre))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_genre))
            .check(ViewAssertions.matches(withText(tvshowDummy[0].genre)))
        Espresso.onView(withId(R.id.tv_detail_overview))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_overview))
            .check(ViewAssertions.matches(withText(tvshowDummy[0].overview)))
        Espresso.onView(withId(R.id.tv_detail_userscore))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_userscore))
            .check(ViewAssertions.matches(withText(tvshowDummy[0].userScore.toString())))
        Espresso.onView(withId(R.id.tv_detail_rdate))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_detail_rdate))
            .check(ViewAssertions.matches(withText(tvshowDummy[0].realeaseDate)))
        Espresso.onView(withId(R.id.iv_detail_bg))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.iv_detail_poster))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}