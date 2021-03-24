package com.example.todolist;

import android.app.Application;

import com.example.todolist.database.Repository;

public class DailerApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Repository.initialize(this);
	}
}
