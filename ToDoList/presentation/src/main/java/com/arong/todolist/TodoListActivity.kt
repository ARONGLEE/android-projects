package com.arong.todolist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arong.data.model.Todo
import com.arong.todolist.databinding.ActivityTodoListBinding
import java.text.SimpleDateFormat

class TodoListActivity : AppCompatActivity() {

    lateinit var editTodoBinding: ActivityTodoListBinding
    private var todo: Todo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        editTodoBinding = ActivityTodoListBinding.inflate(layoutInflater)
        setContentView(editTodoBinding.root)

        val type = intent.getStringExtra("type")

        if (type.equals("ADD")) {
            editTodoBinding.btnSave.text = "추가하기"
        } else {
            todo = intent.getSerializableExtra("item") as Todo?
            editTodoBinding.tvTodoList.setText(todo!!.content)
            editTodoBinding.btnSave.text = "수정하기"
        }
        editTodoBinding.btnSave.setOnClickListener {
            val content = editTodoBinding.tvTodoList.text.toString()
            val currentDate = SimpleDateFormat("MM-dd HH:mm").format(System.currentTimeMillis())

            if (type.equals("ADD")) {
                if (content.isNotEmpty()) {
                    val todo = Todo(0, content, currentDate, false)
                    val intent = Intent().apply {
                        putExtra("todo", todo)
                        putExtra("flag", 0)
                    }
                    setResult(RESULT_OK, intent)
                    finish()
                }
            } else {
                if (content.isNotEmpty()) {
                    val todo = Todo(todo!!.id, content, currentDate, todo!!.isChecked)

                    val intent = Intent().apply {
                        putExtra("todo", todo)
                        putExtra("flag", 1)
                    }
                    setResult(RESULT_OK, intent)
                    finish()
                }
            }
        }
    }
}
