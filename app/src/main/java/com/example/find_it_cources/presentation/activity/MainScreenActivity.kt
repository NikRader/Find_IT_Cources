package com.example.find_it_cources.presentation.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.data.CoursesRepository
import com.example.find_it_cources.R
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MainScreenActivity : AppCompatActivity() {
    private val coursesRepository: CoursesRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)
        lifecycleScope.launch {
            val courseDetails = coursesRepository.getCourseDetails(1)
            println("DEBUG: course details name: ${courseDetails.name}")
        }
    }
}