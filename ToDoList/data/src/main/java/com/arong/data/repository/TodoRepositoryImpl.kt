package com.arong.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.arong.data.dao.TodoDao
import com.arong.data.database.TodoDatabase
import com.arong.data.model.Todo

private const val DATABASE_NAME = "todo-database.db"
class TodoRepository(application: Application) {

    private var mTodoDatabase: TodoDatabase
    private var mTodoDao: TodoDao
    private var mTodoItems: LiveData<MutableList<Todo>>

    init {
        mTodoDatabase = TodoDatabase.getInstance(application)
        mTodoDao = mTodoDatabase.todoDao()
        mTodoItems = mTodoDao.list()
    }

    fun list(): LiveData<MutableList<Todo>> {
        return mTodoItems
    }

    fun getTodo(id: Long): Todo {
        return mTodoDao.selectOne(id)
    }

    fun insert(todo: Todo) {
        Thread(
            Runnable {
                mTodoDao.insert(todo)
            }
        ).start()
    }

    suspend fun update(todo: Todo) {
        return mTodoDao.update(todo)
    }

    fun delete(todo: Todo) {
        return mTodoDao.delete(todo)
    }
}
