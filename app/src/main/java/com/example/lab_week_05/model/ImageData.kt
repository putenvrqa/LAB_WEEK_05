package com.example.lab_week_05.model

import com.squareup.moshi.Json

data class ImageData(
    @Json(name = "id")  val id: String? = null,
    @Json(name = "url") val imageUrl: String? = null
)
