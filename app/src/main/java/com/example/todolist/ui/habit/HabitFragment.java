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
		//binding.habitRecyclerView.setAdapter(new);

		getStartDate();

		return binding.getRoot();
	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		 //подписка
		  //subscribeOn в случае с Flowable не нужен. Запрос в базу будет выполнен не в UI потоке.
		  //А вот, чтобы результат пришел в UI поток, используем observeOn
		/*  mRepository.getHabits()
		         .observeOn(AndroidSchedulers.mainThread())
		         .subscribe(new Consumer<List<Habit>>() {
		            @Override
		             public void accept(List<Habit> employees) throws Exception {
		                 // ...
		             }
		        });
		 */

	}
	private Date getStartDate(){

		Calendar today=Calendar.getInstance();
		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
		today.add(Calendar.DATE,1-dayOfWeek);

		Calendar test=Calendar.getInstance();
		test.add(Calendar.DATE, (-25));
		Log.i("DAGG", String.valueOf(test.get(Calendar.DATE)));

		return today.getTime();
	}
}
