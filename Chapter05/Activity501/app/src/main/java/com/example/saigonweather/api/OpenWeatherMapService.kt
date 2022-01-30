package com.example.saigonweather.api

import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapService {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") q: String,
        @Query("appid") appid: String
    )
}