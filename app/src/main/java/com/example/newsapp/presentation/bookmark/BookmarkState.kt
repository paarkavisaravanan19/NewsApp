package com.example.newsapp.presentation.bookmark

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.usecases.news.SelectArticle

data class BookmarkState(
    val article: List<Article> = emptyList()
)
