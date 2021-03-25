package com.example.todolist;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import com.example.todolist.databinding.ActivityMainBinding;
import com.example.todolist.ui.main.SectionsPagerAdapter;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        binding.viewPager.setAdapter(sectionsPagerAdapter);

    }






}