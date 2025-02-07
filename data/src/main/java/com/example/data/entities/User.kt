package com.example.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int?= null,
    @ColumnInfo(name = "Email")
    var email:String,
    @ColumnInfo(name = "Password")
    var password:String,
)
