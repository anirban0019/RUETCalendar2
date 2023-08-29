package com.example.ruetcalendar2;

import static com.example.ruetcalendar2.Functions.NOTIFICATION_CHANNEL_ID;
import static com.example.ruetcalendar2.Functions.NOTIFICATION_CHANNEL_NAME;
import static com.example.ruetcalendar2.Functions.setAlarm;


import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
        setAlarm(this, 7, 45,0);
        setAlarm(this, 8, 35,1);
        setAlarm(this, 9, 25,2);
        setAlarm(this, 10, 35,3);
        setAlarm(this, 11, 25,4);
        setAlarm(this, 12, 15,5);
        setAlarm(this, 14, 15,6);
        setAlarm(this, 15, 5,7);
        setAlarm(this, 15, 55,8);
    }



    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O) {
            NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            NotificationChannel channel = manager.getNotificationChannel(NOTIFICATION_CHANNEL_ID);
            if (channel == null) {
                channel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, NOTIFICATION_CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
                channel.setDescription("Sync");
                channel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
                manager.createNotificationChannel(channel);
            }
            manager.createNotificationChannel(channel);
        }
    }
}
