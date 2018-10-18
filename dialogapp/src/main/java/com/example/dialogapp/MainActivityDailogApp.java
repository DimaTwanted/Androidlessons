package com.example.dialogapp;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shiz.android.dialogapp.MyDialogFragment;

public class MainActivityDailogApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dailog_app);
    }

    public void onStartDialogClick (View view){
        FragmentManager manager = getSupportFragmentManager();
        MyDialogFragment myDF = new MyDialogFragment();
        myDF.show(manager, "dialog");
    }
}
