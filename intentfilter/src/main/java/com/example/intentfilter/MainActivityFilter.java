package com.example.intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityFilter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_filter);
    }

    public void onShowDateClick(View view){
        startActivity(new Intent("intent.action.showdate"));
    }

    public void onShowTimeClick(View view){
        startActivity(new Intent("intent.action.showtime"));
    }
}