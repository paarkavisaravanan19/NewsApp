package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title : String,
    val description: String,
    @DrawableRes val image : Int
)


val pages = listOf(
    Page(
        title = "Do You Know?",
        description = "Across the globe, more than 24 billion newspapers are published every year. That's a lot of ink! " +
                "The first newspaper in an Indian language was the Samachar Darpanin Bengali.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Do You Know?",
        description = "Most readers only skim. They read headlines until they find an article that interests them. " +
                "Very few people read a newspaper entirely. The oldest existing newspaper in India is Bombay Samacharpublished in 1822 in Gujarati.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Do You Know?",
        description = "Most readers only skim.They read headlines until they find an article that interests them. " +
                "Very few people read a newspaper entirely.\n" +
                "In India, The Times of India is the largest English newspaper, with 2.14 million copies daily.",
        image = R.drawable.onboarding3
    )

)
