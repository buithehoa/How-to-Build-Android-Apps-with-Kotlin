package com.example.saigonweather.model.openweathermap

import com.squareup.moshi.Json

class Response(
    @field:Json(name = "name") val locationName: String,
    val weather: List<ResponseWeather>)