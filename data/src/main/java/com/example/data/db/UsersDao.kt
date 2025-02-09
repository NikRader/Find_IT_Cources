package com.example.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entities.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UsersDao {
    @Insert
    fun insertUser(user: User)

    @Query("SELECT * from users")
    fun getAllUsers(): Flow<List<User>>
}