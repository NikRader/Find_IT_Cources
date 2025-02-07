package com.example.data.db

import android.content.Context
import android.os.Parcelable
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.entities.User

// Моя База Данных
@Database (entities = [User::class], version = 1) // так как можеи быть много entity, то передаем их как массив
abstract class MainDB() : RoomDatabase(), Parcelable {

   abstract fun getDao() : Dao // вернет интерфейс Dao с его функциями

    companion object{
        fun getDb(context:Context): MainDB{
            return Room.databaseBuilder(
                context.applicationContext,
                MainDB::class.java,
                "users.db"
            ).build()
        }
    }

}