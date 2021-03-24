package com.example.todolist.ui.todo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TodoFragment extends Fragment {

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		/* //todo set all recyclerView needs
		* FragmentBeatBoxBinding binding= DataBindingUtil
				.inflate(inflater,R.layout.fragment_beat_box,container,false);

		binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
		binding.recyclerView.setAdapter(new SoundAdapter(mBeatBox.getSounds()));

		* */


		return super.onCreateView(inflater, container, savedInstanceState);
	}
}
