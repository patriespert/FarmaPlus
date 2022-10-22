package com.example.farmaplus

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


object RemoteConnection {

    /*private val okHttpClient = HttpLoggingInterceptor().run {
        level = HttpLoggingInterceptor.Level.BODY
        OkHttpClient.Builder().addInterceptor(this).build()
    }*/

    private val builder = Retrofit.Builder()
        .baseUrl("https://cima.aemps.es/cima/rest/")
//        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service:RemoteService = builder.create()


}