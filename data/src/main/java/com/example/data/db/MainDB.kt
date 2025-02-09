package com.example.data.db

import android.content.Context
import android.os.Parcelable
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.entities.User

@Database(entities = [User::class], version = 1)
abstract class MainDB : RoomDatabase() {

    abstract fun getUsersDao(): UsersDao

    companion object {
        fun createDb(context: Context): MainDB {
            return Room.databaseBuilder(
                context.applicationContext,
                MainDB::class.java,
                "users.db"
            ).build()
        }
    }
}
