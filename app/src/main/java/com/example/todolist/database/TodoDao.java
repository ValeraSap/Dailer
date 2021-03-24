package com.example.todolist.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todolist.model.Todo;

import java.util.List;

import io.reactivex.Flowable;


@Dao
public interface TodoDao {

	@Insert
	void insertTodo(Todo todo);

	@Update
	void updateTodo(Todo todo);

	@Delete
	void deleteTodo(Todo todo);

	@Query("SELECT * FROM todos")
	Flowable<List<Todo>> getTodos();

	@Query("SELECT * FROM todos WHERE id=:todoId")
	Flowable<Todo> getTodo(long todoId);
}
