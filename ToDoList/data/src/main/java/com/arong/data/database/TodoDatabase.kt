package com.arong.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.arong.data.dao.TodoDao
import com.arong.data.model.Todo

// database의 schema가 바뀌었을 경우 version을 변경해주어야 함
// exportSchema = false -> true로 하면 Room의 schema를 json 파일로 생성 할 수 있다
@Database(entities = [Todo::class], version = 1, exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao

    companion object {
        @Volatile private var INSTANCE: TodoDatabase? = null

        fun getInstance(context: Context): TodoDatabase = INSTANCE
            ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, TodoDatabase::class.java, "Todo.db").build()
    }
}
