package com.example.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow


interface LocalUserManager {
    //manages the last app entry by the user
    suspend fun saveAppEntry()

    fun readAppEntry() : Flow<Boolean>
}