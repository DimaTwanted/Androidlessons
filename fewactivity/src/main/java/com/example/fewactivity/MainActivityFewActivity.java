package com.example.fewactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityFewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_few);
    }

    public void onStartActivityClick(View view){
        Intent intent = new Intent(this, SecondActivityFew.class);
        startActivity(intent);
    }
}
