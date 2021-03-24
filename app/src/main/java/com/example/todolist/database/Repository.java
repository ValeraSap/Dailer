package com.example.todolist.database;

import android.content.Context;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.Update;

import com.example.todolist.model.Habit;
import com.example.todolist.model.HabitTimetable;
import com.example.todolist.model.Todo;

import java.util.Date;
import java.util.List;

import io.reactivex.Flowable;


public final class Repository {

	private Context mContext;

	private final TodoDao mTodoDao ;
	private final HabitDao mHabitDao ;
	private final HabitTimetableDao mHabitTimetableDao;

	public void insertTodo(Todo todo){
		mTodoDao.insertTodo(todo);
	}

	public void insertHabitTimetable(HabitTimetable habitTimetable){
		mHabitTimetableDao.insertHabitTimetable(habitTimetable);
	}

	public void insertHabit(Habit habit){
		mHabitDao.insertHabit(habit);
	}

	public void deleteTodo(Todo todo){
		mTodoDao.deleteTodo(todo);
	}

	public void deleteHabitTimetable(HabitTimetable habitTimetable){
		mHabitTimetableDao.deleteHabitTimetable(habitTimetable);
	}

	public void deleteHabit(Habit habit){
		mHabitDao.deleteHabit(habit);
	}

	public void updateTodo(Todo todo){
		mTodoDao.updateTodo(todo);
	}

	public void updateHabitTimetable(HabitTimetable habitTimetable){
		mHabitTimetableDao.updateHabitTimetable(habitTimetable);
	}

	public void updateHabit(Habit habit){
		mHabitDao.updateHabit(habit);
	}

	public Flowable<List<Todo>> getTodos(){
		return mTodoDao.getTodos();
	}

	public Flowable<Todo> getTodo(long todoId){
		return mTodoDao.getTodo(todoId);
	}

	public Flowable<List<Habit>> getHabits(Date startsDate){
		return mHabitDao.getHabits(startsDate);
	}

	public Flowable<Habit> getHabit(long habitId, Date startsDate){
		return mHabitDao.getHabit(habitId, startsDate);
	}

	private static Repository sInstance;
	private Repository(Context context) {
		mContext=context;
		//todo проверить порядок инициалиции при создании класса в java
		DailerDatabase database = Room.databaseBuilder(
				mContext,
				DailerDatabase.class,
				"dailer_db").build();
		mTodoDao = database.todoDao();
		mHabitDao = database.habitDao();
		mHabitTimetableDao= database.habitTimetableDao();
	}
	public static Repository get() {
		if(sInstance!=null)
			return sInstance;
		else throw new IllegalStateException("Repository must be initialized");
	}
	public static void initialize(Context context){
		if(sInstance==null)
			sInstance=new Repository(context);
	}

}
