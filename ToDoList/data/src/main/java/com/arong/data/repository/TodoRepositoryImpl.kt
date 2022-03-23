package com.arong.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.arong.data.Mapper.map
import com.arong.data.dao.TodoDao
import com.arong.data.database.TodoDatabase
import com.arong.data.model.Todo
import com.arong.domain.model.TodoItem
import com.arong.domain.repository.TodoRepository

private const val DATABASE_NAME = "todo-database.db"
class TodoRepositoryImpl(application: Application) : TodoRepository {
    private var mTodoDatabase: TodoDatabase
    private var mTodoDao: TodoDao
    private var mTodoItems: LiveData<MutableList<Todo>>

    init {
        mTodoDatabase = TodoDatabase.getInstance(application)
        mTodoDao = mTodoDatabase.todoDao()
        mTodoItems = mTodoDao.list()
    }
    override fun list(): LiveData<MutableList<TodoItem>> {
        return mTodoItems
    }
    override fun getTodo(id: Long): TodoItem {
        return mTodoDao.selectOne(id)
    }

    fun insert(todo: Todo) {
        Thread(
            Runnable {
                mTodoDao.insert(todo.map())
            }
        ).start()
    }

    suspend fun update(todo: Todo) {
        return mTodoDao.update(todo.map())
    }

    fun delete(TodoItem.map()) {
        return mTodoDao.delete()
    }
}