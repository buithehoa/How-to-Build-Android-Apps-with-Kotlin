package com.example.saigonweather.api

import com.example.saigonweather.model.openweathermap.ResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapService {
    @GET("weather")
    fun getWeather(
        @Query("q") q: String,
        @Query("appid") appid: String
    ) : Call<ResponseData>
}
