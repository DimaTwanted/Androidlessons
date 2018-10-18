package com.example.notificationapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

public class MainActivityNotification extends AppCompatActivity {

    private static final int MY_NOTIFICATION_ID = 12345;
    private static final int MY_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_notification);

    }

    void onClickSendNotification(View view) {
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);
        notificationBuilder.setAutoCancel(true);

        notificationBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        notificationBuilder.setTicker("This is MIREA!");

        notificationBuilder.setWhen(System.currentTimeMillis());
        notificationBuilder.setContentTitle("This is title");
        notificationBuilder.setContentText("This is still second lesson!");

        //Create Intent
        Intent intent = new Intent(this, MainActivityNotification.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, MY_REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notificationBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationService = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = notificationBuilder.build();
        notificationService.notify(MY_NOTIFICATION_ID, notification);
    }

//    void onClickSendNotification(View view){
////        NewMessageNotification.notify(getApplicationContext(), "This is MIREA!", 2);
////    }
}
