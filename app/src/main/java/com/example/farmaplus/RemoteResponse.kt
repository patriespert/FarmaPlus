package com.example.farmaplus

import com.google.gson.annotations.SerializedName

data class RemoteResponse(
    @SerializedName("totalFilas") var rows: Int,
    @SerializedName("pagina") var page: Int,
    @SerializedName("tamanioPagina")  var pageSize:Int,
    @SerializedName("resultados")  var medicines: List<Medicine>
    )