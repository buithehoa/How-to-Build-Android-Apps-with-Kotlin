package com.example.saigonweather.model.openweathermap

import com.squareup.moshi.Json

class ResponseWeather(
    @field: Json(name = "main") val status: String,
    val description: String,
    val icon: String)
