package com.teamsnap.data


import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val teamSnapClient: TeamSnapApi = Retrofit.Builder()
    .baseUrl("https://gist.githubusercontent.com/keiferstone/1320bd015645f83e11c28a9e66cf9ae6/raw/32afa4ce7f88cd7fff929b7714f2636305b597c1/")
    .addConverterFactory(GsonConverterFactory.create(
        GsonBuilder()
            // TODO Register necessary type adapter(s) here
            .setLenient()
            .create()))
    .client(OkHttpClient.Builder().build())
    .build()
    .create(TeamSnapApi::class.java)
