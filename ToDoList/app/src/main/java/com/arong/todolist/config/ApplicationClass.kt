package com.arong.todolist.config

import android.app.Application
import com.arong.todolist.repository.TodoRepository

class ApplicationClass : Application() {

    override fun onCreate() {
        super.onCreate()

        TodoRepository.initialize(this)
    }
}
