package com.arong.data.Mapper

import com.arong.data.model.Todo
import com.arong.domain.model.TodoItem

// domain의 model과 data의 model를 서로 변환해줄 수 있는 mapper를 추가
// data -> domain
fun mapperTodo(todo: List<Todo>): List<TodoItem> {
    return todo.toList().map {
        TodoItem(
            it.id,
            it.content,
            it.timestamp,
            it.isChecked
        )
    }
}

fun Todo.map() = TodoItem(
    id,
    content,
    timestamp,
    isChecked
)

// domain -> data
fun mapperTodoEntity(todoItems: List<TodoItem>): List<Todo> {
    return todoItems.toList().map {
        Todo(
            it.id,
            it.content,
            it.timestamp,
            it.isChecked
        )
    }
}

fun TodoItem.map() = Todo(
    id,
    content,
    timestamp,
    isChecked
)
