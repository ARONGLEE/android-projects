package com.arong.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lcom/arong/todolist/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mTodoAdapter", "Lcom/arong/todolist/adapter/TodoAdapter;", "getMTodoAdapter", "()Lcom/arong/todolist/adapter/TodoAdapter;", "setMTodoAdapter", "(Lcom/arong/todolist/adapter/TodoAdapter;)V", "mTodoViewModel", "Lcom/arong/todolist/viewmodel/TodoViewModel;", "getMTodoViewModel", "()Lcom/arong/todolist/viewmodel/TodoViewModel;", "setMTodoViewModel", "(Lcom/arong/todolist/viewmodel/TodoViewModel;)V", "requestActivity", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "todoBinding", "Lcom/arong/todolist/databinding/ActivityMainBinding;", "getTodoBinding", "()Lcom/arong/todolist/databinding/ActivityMainBinding;", "setTodoBinding", "(Lcom/arong/todolist/databinding/ActivityMainBinding;)V", "initViewModel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "presentation_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.arong.todolist.databinding.ActivityMainBinding todoBinding;
    public com.arong.todolist.viewmodel.TodoViewModel mTodoViewModel;
    public com.arong.todolist.adapter.TodoAdapter mTodoAdapter;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestActivity = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.arong.todolist.databinding.ActivityMainBinding getTodoBinding() {
        return null;
    }
    
    public final void setTodoBinding(@org.jetbrains.annotations.NotNull()
    com.arong.todolist.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.arong.todolist.viewmodel.TodoViewModel getMTodoViewModel() {
        return null;
    }
    
    public final void setMTodoViewModel(@org.jetbrains.annotations.NotNull()
    com.arong.todolist.viewmodel.TodoViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.arong.todolist.adapter.TodoAdapter getMTodoAdapter() {
        return null;
    }
    
    public final void setMTodoAdapter(@org.jetbrains.annotations.NotNull()
    com.arong.todolist.adapter.TodoAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}