package com.example.moviecatalogue

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class MovieResponse {
    @Parcelize
    data class MovieResponse(
        @SerializedName("results")
        val movies : List<Movie>

    ) {
        constructor() : this(mutableListOf())
    }

}
