package com.example.todolist.ui.habit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolist.R;
import com.example.todolist.databinding.ItemHabitBinding;
import com.example.todolist.model.Habit;

import java.util.List;

public class HabitAdapter extends RecyclerView.Adapter<HabitAdapter.HabitHolder> {

	private List<Habit> mHabits;


	public HabitAdapter(List<Habit> habits) {
		mHabits = habits;

	}

	@NonNull
	@Override
	public HabitHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		LayoutInflater inflater = LayoutInflater.from(parent.getContext());
		ItemHabitBinding binding = DataBindingUtil
				.inflate(inflater, R.layout.item_habit,parent,false);

		return new HabitHolder(binding);
	}

	@Override
	public void onBindViewHolder(@NonNull HabitHolder holder, int position) {
		Habit habit=mHabits.get(position);
		holder.bind(habit);
	}

	@Override
	public int getItemCount() {
		return mHabits.size();
	}

	public class HabitHolder extends  RecyclerView.ViewHolder {

		private ItemHabitBinding mBinding;

		public HabitHolder(ItemHabitBinding binding) {
			super(binding.getRoot());
			mBinding=binding;
		}

		public void bind(Habit sound) {
			mBinding.executePendingBindings();
		}
	}


}
