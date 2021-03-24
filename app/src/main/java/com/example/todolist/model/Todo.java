package com.example.todolist.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity(tableName = "todos")
public class Todo {

	@PrimaryKey(autoGenerate = true)
	public long id;

	public String name;
	public Boolean isDone;


}
