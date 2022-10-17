package com.ezgiakca.weatherapp.feature_weather.data.data_source.remote

import com.ezgiakca.weatherapp.feature_weather.data.data_source.remote.dto.WeatherDto
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherApi {
    @GET("https://api.open-meteo.com/v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("lattitude") lat: Double,
        @Query("longitude") lon: Double
    ): WeatherDto
}