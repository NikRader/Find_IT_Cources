package com.example.find_it_cources.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.data.api.Api
import com.example.find_it_cources.R

class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        val my_api = Api(this).get_data_from_api()
        Log.d("api2", "Информация с API: $my_api")
    }
}