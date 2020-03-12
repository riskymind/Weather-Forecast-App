package com.thisiskelechi.weatherforecastapp.data.reponse
//
//
//import com.google.gson.annotations.SerializedName
//import kotlinx.serialization.*
//import kotlinx.serialization.json.*
//import kotlinx.serialization.internal.*
//
//@Serializable
//data class Welcome (
//    val request: Request,
//    val location: Location,
//    val current: Current
//)
//
//@Serializable
//data class Current (
//    @SerializedName("observation_time")
//    val observationTime: String,
//
//    val temperature: Long,
//
//    @SerialName("weather_code")
//    val weatherCode: Long,
//
//    @SerialName("weather_icons")
//    val weatherIcons: List<String>,
//
//    @SerialName("weather_descriptions")
//    val weatherDescriptions: List<String>,
//
//    @SerialName("wind_speed")
//    val windSpeed: Long,
//
//    @SerialName("wind_degree")
//    val windDegree: Long,
//
//    @SerialName("wind_dir")
//    val windDir: String,
//
//    val pressure: Long,
//    val precip: Long,
//    val humidity: Long,
//    val cloudcover: Long,
//    val feelslike: Long,
//
//    @SerialName("uv_index")
//    val uvIndex: Long,
//
//    val visibility: Long,
//
//    @SerialName("is_day")
//    val isDay: String
//)
//
//@Serializable
//data class Location (
//    val name: String,
//    val country: String,
//    val region: String,
//    val lat: String,
//    val lon: String,
//
//    @SerialName("timezone_id")
//    val timezoneID: String,
//
//    val localtime: String,
//
//    @SerialName("localtime_epoch")
//    val localtimeEpoch: Long,
//
//    @SerialName("utc_offset")
//    val utcOffset: String
//)
//
//@Serializable
//data class Request (
//    val type: String,
//    val query: String,
//    val language: String,
//    val unit: String
//)
