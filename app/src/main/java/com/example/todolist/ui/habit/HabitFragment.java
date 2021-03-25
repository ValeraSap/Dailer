package com.example.todolist.ui.habit;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.todolist.R;
import com.example.todolist.database.Repository;
import com.example.todolist.databinding.FragmentHabitsBinding;
import com.example.todolist.model.Habit;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import io.reactivex.functions.Consumer;

public class HabitFragment extends Fragment {

	private Repository mRepository=Repository.get();


	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		 FragmentHabitsBinding binding= DataBindingUtil
				.inflate(inflater, R.layout.fragment_habits,container,false);

		binding.habitRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


		return binding.getRoot();
	}

}
