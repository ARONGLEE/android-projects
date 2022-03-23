package com.arong.domain.repository

import androidx.lifecycle.LiveData
import com.arong.domain.model.TodoItem

interface TodoRepository {
    fun list(): LiveData<List<TodoItem>>
    fun getTodo(id: Long): TodoItem
    fun inser(todo: TodoItem)
    fun update(todo: TodoItem)
    fun delete(todo: TodoItem)
}
