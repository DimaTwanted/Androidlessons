package com.example.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivityToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_toast);
        showToast();
    }

    void showToast() {
        Toast toast = Toast.makeText(getApplicationContext(), "This is second lesson!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);

        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(R.mipmap.ic_launcher);
        toastContainer.addView(imageView, 0);

        toast.show();
    }
}
