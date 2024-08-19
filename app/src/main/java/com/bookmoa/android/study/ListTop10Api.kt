package com.bookmoa.android.study

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ListTop10Api {
    @GET("library/list/top")
    suspend fun getTop10List(
        @Header("Authorization") auth: String,
        @Query("page") page: Int = 1
    ): Response<ListTop10Response>
}

