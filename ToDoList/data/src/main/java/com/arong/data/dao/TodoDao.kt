package com.arong.data.dao

import androidx.lifecycle.LiveData
import androidx.room.* // ktlint-disable no-wildcard-imports
import com.arong.data.model.Todo

@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(todo: Todo)

    @Query("select * from todoTable")
    fun list(): LiveData<MutableList<Todo>>

    @Query("select * from todoTable where id = (:id)")
    fun selectOne(id: Long): Todo

    @Update
    suspend fun update(todo: Todo)

    @Delete
    fun delete(todo: Todo)
}
