package ru.mirea.p0021firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Create", "Метод onCreate");

        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text in TextView");

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("My button");
        myBtn.setEnabled(false);

        CheckBox myChb = (CheckBox) findViewById(R.id.myChb);
        myChb.setChecked(true);

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Start", "Метод onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Pause", "Метод onPause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Resume", "Метод onResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Stop", "Метод onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Destroy", "Метод onDestroy");
    }
}
