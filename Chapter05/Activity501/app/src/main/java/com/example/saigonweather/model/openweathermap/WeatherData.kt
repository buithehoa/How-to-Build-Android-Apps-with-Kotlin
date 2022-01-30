package com.example.saigonweather.model.openweathermap

import com.squareup.moshi.Json

class WeatherData(
    @field: Json(name = "main") val status: String,
    val description: String,
    val icon: String)
