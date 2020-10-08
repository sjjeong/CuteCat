package com.dino.cutecat.remote.model

import com.google.gson.annotations.SerializedName

data class CatImageResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("url")
    val url: String
)