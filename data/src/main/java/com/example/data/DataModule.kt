package com.example.data

import com.example.data.api.CoursesApi
import com.example.data.db.MainDB
import org.koin.android.ext.koin.androidApplication
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit

val dataModule = module {
    single { createRetrofit() }
    single { get<Retrofit>().create(CoursesApi::class.java) }
    single { MainDB.createDb(androidApplication()).getUsersDao() }
    singleOf(::CoursesRepositoryImpl) { bind<CoursesRepository>() }
}

fun createRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://stepik.org")
        .build()
}
