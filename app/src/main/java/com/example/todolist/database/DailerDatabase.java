package com.example.todolist.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.todolist.model.Habit;
import com.example.todolist.model.HabitTimetable;
import com.example.todolist.model.Todo;

@Database(
		entities = {Habit.class, Todo.class, HabitTimetable.class},
		version = 1)
@TypeConverters(Converters.class)
public abstract class DailerDatabase extends RoomDatabase {
	public abstract HabitDao habitDao();
	public abstract HabitTimetableDao habitTimetableDao();
	public abstract TodoDao todoDao();
}
