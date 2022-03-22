package com.arong.domain.model

data class TodoItem(
    var id: Long,
    val content: String,
    val timestamp: String,
    val isChecked: Boolean
)
