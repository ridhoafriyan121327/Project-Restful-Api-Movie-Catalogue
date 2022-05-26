package com.example.moviecatalogue

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class Movie {
    val title: Any
        get() {
            TODO()
        }

    val poster: Any?
        get() {
            TODO()
        }

    @Parcelize
    data class Movie(
        @SerializedName("id")
        val id : String ?,
        @SerializedName("title")
        val title : String?,
        @SerializedName("poster_path")
        val poster : String?,
        @SerializedName("release_date")
        val release : String?
        ) {
        constructor() : this("", "", "", "")
    }
}