package com.example.moviecatalogue

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieApiService {
    companion object{
        private const val BASE_URL = "https://api.themoviedb.org"
        private var retrofit : Retrofit? = null

        fun getInstance() : Retrofit{
            if(retrofit == null){
                Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().also { retrofit = it }
            }
            return retrofit!!
        }
    }
}
