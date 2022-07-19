package com.arong.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0019\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/arong/data/repository/TodoRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mTodoDao", "Lcom/arong/data/dao/TodoDao;", "mTodoDatabase", "Lcom/arong/data/database/TodoDatabase;", "mTodoItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/arong/data/model/Todo;", "delete", "", "todo", "getTodo", "id", "", "insert", "list", "update", "(Lcom/arong/data/model/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class TodoRepository {
    private com.arong.data.database.TodoDatabase mTodoDatabase;
    private com.arong.data.dao.TodoDao mTodoDao;
    private androidx.lifecycle.LiveData<java.util.List<com.arong.data.model.Todo>> mTodoItems;
    
    public TodoRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.arong.data.model.Todo>> list() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.arong.data.model.Todo getTodo(long id) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.arong.data.model.Todo todo) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.arong.data.model.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.arong.data.model.Todo todo) {
    }
}