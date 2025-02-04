package com.example.data.api

import retrofit2.http.GET

interface Cources_api {
    @GET("courses/1")
    fun get_courceById():Cource_info
}