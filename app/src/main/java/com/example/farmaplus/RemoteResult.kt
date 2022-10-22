package com.example.farmaplus

import com.google.gson.annotations.SerializedName
import java.util.*

data class Medicine(
    @SerializedName("nregistro") val registerNumber: String,
    @SerializedName("nombre") val name: String,
    //@SerializedName("pactivos") val activePrinciples: String,
    @SerializedName("labtitular") val laboratory: String,
    @SerializedName("cpresc") val prescribingConditions: String,
    @SerializedName("estado") val status: Status,
    @SerializedName("comerc") val comerzialized: Boolean,
    @SerializedName("receta") val needsRecipe: Boolean,
    @SerializedName("generico") val isGeneric: Boolean,
    @SerializedName("conduc") val affectsDriving: Boolean,
    @SerializedName("triangulo") val hasBlackTriangule: Boolean,
    @SerializedName("huerfano") val isOrphan: Boolean,
    @SerializedName("biosimilar") val isBiosimilar: Boolean,
    @SerializedName("nosustituible") val sustituibleItem: SustituibleItem,
    @SerializedName("psum") val hasSupplyProblems: Boolean,
    @SerializedName("notas") val hasNotes: Boolean,
    @SerializedName("materialesInf") val hasComputerizedMaterials: Boolean,
    @SerializedName("ema") val isEma: Boolean,
    @SerializedName("docs") val documents: List<Document>?,
    @SerializedName("fotos") val photos: List<Photo>?,
    @SerializedName("viasAdministracion") val administrationType: List<AdministrationType>?,
    @SerializedName("formaFarmaceutica") val dosageForm: DosageType,
    @SerializedName("formaFarmaceuticaSimplificada") val simplifiedDosageForm: SimplifiedDosageType,
    //@SerializedName("atcs") val atcCodes: List<AtcCode>?,
    //@SerializedName("principiosActivos") val activePrinciplesList: List<activePrinciple>,
    //@SerializedName("presentaciones") val presentation: List<Presentation>?,
    @SerializedName("dosis") val dosis: String

)

/*data class AtcCode(
    @SerializedName("codigo") val code: String,
    @SerializedName("nombre") val name: String,
    @SerializedName("nivel") val id: Int

    )*/


/*data class activePrinciple(
    @SerializedName("id") val id: Int,
    @SerializedName("codigo") val code: String,
    @SerializedName("nombre") val name: String,
    @SerializedName("cantidad") val quantity: String,
    @SerializedName("unidad") val units: String,
    @SerializedName("orden") val order: Int
)*/


/*
data class Presentation(
    @SerializedName("cn") val regNumber: String,
    @SerializedName("nombre") val Name: String,
    @SerializedName("estado") val status: Status,
    @SerializedName("comerc") val isComercialized: Boolean,
    @SerializedName("psum") val hasSupplyProblems: Boolean
)
*/

data class Status(
    @SerializedName("aut") val authorizedDate: Long,
    )

data class Document(
    @SerializedName("tipo") val type: Int,
    @SerializedName("url") val url: String,
    @SerializedName("urlHtml") val urlHtml: String,
    @SerializedName("secc") val isHtmlAvailable: Boolean,
    @SerializedName("fecha") val docDate: Long
)

data class Photo(
    @SerializedName("tipo") val type: String,
    @SerializedName("url") val url: String,
    //@SerializedName("fecha") val photoDate: Long

)

data class AdministrationType(
    @SerializedName("id") val administrationId: Int,
    @SerializedName("nombre") val administrationName: String
)

data class DosageType(
    @SerializedName("id") val dosageId: Int,
    @SerializedName("nombre") val dosageName: String
)

data class SimplifiedDosageType(
    @SerializedName("id") val simplifiedDosageId: Int,
    @SerializedName("nombre") val simplifiedDosageName: String
)

data class SustituibleItem(
    @SerializedName("id") val id: Int?,
    @SerializedName("nombre") val name: String,
    @SerializedName("codigo") val code: String?
)