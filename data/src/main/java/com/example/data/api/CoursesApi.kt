package com.example.data.api

import retrofit2.http.GET
import retrofit2.http.Path

interface CoursesApi {

    @GET("api/courses/")
    fun getCourses(): CourseInfo

    @GET("api/courses/{id}")
    fun getCourseById(@Path("id") id: Int): CourseInfo
}
