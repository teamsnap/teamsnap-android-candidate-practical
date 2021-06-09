package com.teamsnap.data

import retrofit2.Response
import retrofit2.http.GET

interface TeamSnapApi {

    @GET("teams")
    suspend fun getTeams(): Response<CJCollection>
}