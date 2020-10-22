package com.example.todolist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

   private EditText editText;
   private LinearLayout linearLayout;
   // private LinearLayout task=new LinearLayout(this); //в дальнейшем будем делать копию. паттерн шаблон?



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.todo_text);
        linearLayout=(LinearLayout)findViewById(R.id.todo_container);




    }

    @Nullable
    @Override
    public LinearLayout onRetainCustomNonConfigurationInstance() {
        return linearLayout;
    }
/*public LinearLayout onRetainNonConfigurationInstance()
    {
        return linearLayout;
    }*/

    public  void add(View view){
        linearLayout.addView(createTask(editText.getText().toString()));
        editText.setText("");
    }

    private LinearLayout createTask(String text){
        LinearLayout task=new LinearLayout(this);
        task.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        task.setLayoutParams(layoutParams);

        CheckBox checkBox=new CheckBox(this);
        checkBox.setText(text);

        task.addView(checkBox);

        return task;
    }
}