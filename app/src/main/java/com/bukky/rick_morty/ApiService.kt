package com.bukky.rick_morty

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface ApiService {
    @GET("api/character")
    suspend fun getCharacters():Response<RickandMortyResponse>

    companion object{
        const val BASE_URL = "https://rickandmortyapi.com/"
        fun getInstance(retrofit: Retrofit) =
                retrofit.create(ApiService::class.java)

    }

}