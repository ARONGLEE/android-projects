package com.arong.todolist.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.arong.todolist.dao.TodoDao
import com.arong.todolist.dto.Todo

@Database(entities = arrayOf(Todo::class), version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}
