package com.example.saigonweather.model.openweathermap

import com.squareup.moshi.Json

class ResponseData(
    @field:Json(name = "name") val locationName: String,
    val weather: List<WeatherData>)