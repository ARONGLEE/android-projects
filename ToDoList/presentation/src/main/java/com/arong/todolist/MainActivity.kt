package com.arong.todolist

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.arong.data.model.Todo
import com.arong.todolist.adapter.TodoAdapter
import com.arong.todolist.databinding.ActivityMainBinding
import com.arong.todolist.viewmodel.TodoViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var todoBinding: ActivityMainBinding
    lateinit var mTodoViewModel: TodoViewModel
    lateinit var mTodoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        todoBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(todoBinding.root)

        todoBinding.btnAdd.setOnClickListener {
            val intent = Intent(this, TodoListActivity::class.java).apply {
                putExtra("type", "ADD")
            }
            requestActivity.launch(intent)
        }

        initViewModel()

        mTodoAdapter = TodoAdapter(this)
        todoBinding.rvTodoList.layoutManager = LinearLayoutManager(applicationContext)
        todoBinding.rvTodoList.adapter = mTodoAdapter

        mTodoAdapter.setItemCheckBoxClickListener(object : TodoAdapter.ItemCheckBoxClickListener {
            override fun onClick(view: View, position: Int, itemId: Long) {
                CoroutineScope(Dispatchers.IO).launch {
                    var todo = mTodoViewModel.getOne(itemId)
                    todo.isChecked = !todo.isChecked
                    mTodoViewModel.update(todo)
                }
            }
        })

        mTodoAdapter.setItemClickListener(object : TodoAdapter.ItemClickListener {
            override fun onClick(view: View, position: Int, itemId: Long) {
                CoroutineScope(Dispatchers.IO).launch {
                    val todo = mTodoViewModel.getOne(itemId)

                    val intent = Intent(this@MainActivity, TodoListActivity::class.java).apply {
                        putExtra("type", "EDIT")
                        putExtra("item", todo)
                    }
                    requestActivity.launch(intent)
                }
            }
        })
    }

    private fun initViewModel() {
        // viewModel Provider를 통해 초기화
        mTodoViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(TodoViewModel::class.java)
        // todoList는 LiveData이기 때문에 observe를 통해 변화된 값을 감지
        mTodoViewModel.getTodoList().observe(
            this,
            Observer {
                mTodoAdapter.update(it)
            }
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.menu_item_delete -> {
                Toast.makeText(this, "삭제", Toast.LENGTH_LONG).show()
                mTodoViewModel.getTodoList().value!!.forEach {
                    if (it.isChecked) {
                        mTodoViewModel.delete(it)
                    }
                }
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private val requestActivity = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == RESULT_OK) {
            val todo = it.data?.getSerializableExtra("todo") as Todo

            when (it.data?.getIntExtra("flag", -1)) {
                0 -> {
                    CoroutineScope(Dispatchers.IO).launch {
                        mTodoViewModel.insert(todo)
                    }
                    Toast.makeText(this, "추가되었습니다!", Toast.LENGTH_LONG).show()
                }
                1 -> {
                    CoroutineScope(Dispatchers.IO).launch {
                        mTodoViewModel.update(todo)
                    }
                    Toast.makeText(this, "수정되었습니다!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
