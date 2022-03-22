package com.arong.todolist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.arong.data.model.Todo
import com.arong.data.repository.TodoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// ViewModel에서 Context가 필요한 경우 AndroidViewModel 클래스를 상속받아 Application 객체를 넘길 것을 권장
// 그 이유 : ViewModel에서 Context를 갖고 있으면 메모리 누수의 원인
class TodoViewModel(application: Application) : AndroidViewModel(application) {
    private val mTodoRepository: TodoRepository
    private val mTodoItems: LiveData<MutableList<Todo>>

    init {
        mTodoRepository = TodoRepository(application)
        mTodoItems = mTodoRepository.list()
    }

    fun getOne(id: Long) = mTodoRepository.getTodo(id)
//    fun getOne(id: Long) {
//        mTodoRepository.getTodo(id)
//    }
    // -> = 과 {} 차이가 있다.. 차이가 뭐지?? {}했을땐 액티비티에서 체크값 토글에서 뷰모델을 통해 isChecked 접근이 안됨..

    // launch -> 코루틴을 사용한 비동기 처리
    // IO -> 코루틴을 사용해서 IO 쓰레드에서 호출
    fun insert(todoModel: Todo) = viewModelScope.launch(Dispatchers.IO) {
        mTodoRepository.insert(todoModel)
    }

    fun getTodoList(): LiveData<MutableList<Todo>> {
        return mTodoItems
    }

    fun update(todoModel: Todo) = viewModelScope.launch(Dispatchers.IO) {
        mTodoRepository.update(todoModel)
    }

    fun delete(todoModel: Todo) = viewModelScope.launch(Dispatchers.IO) {
        mTodoRepository.delete(todoModel)
    }
}
