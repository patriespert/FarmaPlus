package com.example.farmaplus

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface RemoteService {

    @GET("medicamentos")
    suspend fun getMedicines(
        @Query("autorizados") authorized:Int,
        @Query("comerc") comercialized:Int,
        @Query("pagina") page:Int
    ):Response<RemoteResponse>

}