package com.dino.cutecat.remote

import com.dino.cutecat.remote.model.CatImageResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v1/images/search")
    suspend fun getImages(
        @Query("size") size: String = "full",
        @Query("limit") limit: Int = 20,
        @Query("page") page: Int = 0
    ): List<CatImageResponse>

}
