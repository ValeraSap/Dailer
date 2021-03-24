package com.example.todolist.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.List;


@Entity(tableName = "habits")
public class Habit {

	@PrimaryKey(autoGenerate = true)
	public long id;

	public String name;

	@Ignore
	public List<HabitTimetable> habitTimetable;


	public long getId() {
		return id;
	}


}
