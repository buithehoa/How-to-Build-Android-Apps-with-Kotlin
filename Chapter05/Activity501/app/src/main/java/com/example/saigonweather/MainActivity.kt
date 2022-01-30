package com.example.saigonweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.saigonweather.api.OpenWeatherMapService
import com.example.saigonweather.model.openweathermap.ResponseData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : AppCompatActivity() {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    private val weatherApiService by lazy {
        retrofit.create(OpenWeatherMapService::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherApiService
            .getWeather("Ho Chi Minh", "15c40c35ffa719da203b1a417a790d3a")
            .enqueue(object : Callback<ResponseData> {
                override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(call: Call<ResponseData>, response: retrofit2.Response<ResponseData>) {
                    TODO("Not yet implemented")
                }
            })
    }
}