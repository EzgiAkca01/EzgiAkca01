package com.ezgiakca.weatherapp.feature_weather.data.data_source.remote.dto

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
