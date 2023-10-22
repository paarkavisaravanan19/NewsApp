package com.example.newsapp.presentation.search

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import com.example.newsapp.domain.model.Article

data class SearchState(
    val searchQuery: String = "",
    val articles : Flow<PagingData<Article>>? = null
)