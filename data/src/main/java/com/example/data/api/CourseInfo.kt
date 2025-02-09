package com.example.data.api

import com.google.gson.annotations.SerializedName

data class CourseInfo(
    val id: Int,
    val summary: String,
    @SerializedName("lessons_count")
    val lessonsCount: Int,
    @SerializedName("review_summary")
    val reviewSummary: String
)
