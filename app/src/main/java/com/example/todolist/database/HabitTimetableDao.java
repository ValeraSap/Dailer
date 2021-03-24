package com.example.todolist.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todolist.model.Habit;
import com.example.todolist.model.HabitTimetable;
import com.example.todolist.model.Todo;

import java.util.Date;
import java.util.List;

import io.reactivex.Flowable;

@Dao
interface HabitTimetableDao {


	@Insert
	void insertHabitTimetable(HabitTimetable habitTimetable);

	@Delete
	void deleteHabitTimetable(HabitTimetable habitTimetable);


	@Update
	void updateHabitTimetable(HabitTimetable habitTimetable);



}
