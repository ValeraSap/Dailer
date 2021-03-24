package com.example.todolist.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todolist.model.Habit;

import java.util.Date;
import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface HabitDao {
	@Insert
	void insertHabit(Habit habit);
	@Delete
	void deleteHabit(Habit habit);


	@Query("SELECT * FROM habits, habits_timetable"+
			" WHERE habits_timetable.habit_id==habits.id AND habits_timetable.date > :startsDate ")
	Flowable<List<Habit>> getHabits(Date startsDate);

	//todo test
	@Query("SELECT * FROM habits, habits_timetable"+
			" WHERE habits.id==:habitId AND habits_timetable.date > :startsDate AND habits_timetable.habit_id==habits.id")
	Flowable<Habit> getHabit(long habitId, Date startsDate);

	@Update
	void updateHabit(Habit habit);

}
