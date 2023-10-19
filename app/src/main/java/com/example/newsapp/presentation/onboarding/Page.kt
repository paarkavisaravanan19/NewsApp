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
        title = "Dummy Data for Title",
        description = "MVVM architecture is a Model-View-ViewModel architecture that removes the tight " +
                "coupling between each component. Most importantly, in this architecture.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Dummy Data for Title",
        description = "MVVM architecture is a Model-View-ViewModel architecture that removes the tight " +
                "coupling between each component. Most importantly, in this architecture.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Dummy Data for Title",
        description = "MVVM architecture is a Model-View-ViewModel architecture that removes the tight " +
                "coupling between each component. Most importantly, in this architecture.",
        image = R.drawable.onboarding3
    )

)
