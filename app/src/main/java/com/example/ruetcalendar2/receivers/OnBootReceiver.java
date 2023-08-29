package com.example.ruetcalendar2.receivers;

import static android.content.Context.MODE_PRIVATE;


import static com.example.ruetcalendar2.Functions.setAlarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OnBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        setAlarm(context, 7, 45,0);
        setAlarm(context, 8, 35,1);
        setAlarm(context, 9, 25,2);
        setAlarm(context, 10, 35,3);
        setAlarm(context, 11, 25,4);
        setAlarm(context, 12, 15,5);
        setAlarm(context, 14, 15,6);
        setAlarm(context, 15, 5,7);
        setAlarm(context, 15, 55,8);
    }
}