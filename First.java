package com.example.firsttemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class First extends AppCompatActivity {
  private final String Log_Tag=First.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void launchSecondActivity(View view) {
        Log.d(Log_Tag,"Button Clicked!");
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}