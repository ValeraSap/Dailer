package com.example.todolist.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

import static androidx.room.ForeignKey.CASCADE;


@Entity(tableName = "habits_timetable",
		foreignKeys = @ForeignKey(
				entity=Habit.class,
				parentColumns = "id",
				childColumns = "habit_id",
				onDelete = CASCADE
		)
)
public class HabitTimetable {

	@PrimaryKey(autoGenerate = true)
	public long id;

	public Date date;
	public Boolean isDone;

	@ColumnInfo(name = "habit_id")
	public long habitId;


	public long getId() {
		return id;
	}

}
