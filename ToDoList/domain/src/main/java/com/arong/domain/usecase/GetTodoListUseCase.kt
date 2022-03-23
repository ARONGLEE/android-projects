package com.arong.domain.usecase

import androidx.lifecycle.LiveData
import com.arong.domain.model.TodoItem
import com.arong.domain.repository.TodoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class GetTodoListUseCase(private val todoRepository: TodoRepository) {

    operator fun invoke(
        owner: String,
        scope: CoroutineScope,
        onResult: (List<TodoItem>) -> Unit = {}
    ) {
        scope.launch(Dispatchers.Main) {
            val deferred = async(Dispatchers.IO) {
                todoRepository.list(owner)
            }
            onResult(deferred.await())
        }
    }

}