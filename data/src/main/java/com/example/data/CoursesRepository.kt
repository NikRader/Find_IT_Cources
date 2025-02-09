package com.example.data

import com.example.data.api.CoursesApi

interface CoursesRepository {
    suspend fun getCourses(): List<Course>

    suspend fun getCourseDetails(id: Int): CourseDetails
}

internal class CoursesRepositoryImpl(
    private val api: CoursesApi
) : CoursesRepository {

    override suspend fun getCourses(): List<Course> {
        return emptyList()
    }

    override suspend fun getCourseDetails(id: Int): CourseDetails {
        return CourseDetails("XDXDXD")
    }

}

data class Course(val name: String)
data class CourseDetails(val name: String)