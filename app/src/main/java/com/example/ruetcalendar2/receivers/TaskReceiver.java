package com.example.ruetcalendar2.receivers;


import static com.example.ruetcalendar2.Functions.setAlarm;
import static com.example.ruetcalendar2.Functions.showNotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.format.DateFormat;

import java.util.Calendar;

/**
 * Broadcast Receiver class triggers at the set time even the off is not open.
 */

public class TaskReceiver extends BroadcastReceiver {

    Context context;

    @Override
    public void onReceive(Context context, Intent intent) {
        this.context = context;

        String time = DateFormat.format("HHmm", Calendar.getInstance()).toString();
        String keys = getkeys(time);

        SharedPreferences sharedPreferences = context.getSharedPreferences("Routine", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1=sharedPreferences.edit();
        String value=sharedPreferences.getString(keys,"");
        if (!value.equals("")) {
            showNotification(context, value);
        }
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

    String getkeys(String time) {
        Calendar calendar = Calendar.getInstance();
        String pos1;
        String day = calendar.get(Calendar.DAY_OF_WEEK) + "";
        if (day.equals("7")) {
            pos1 = "0";
        } else {
            pos1 = day;
        }

        String prt2;
        switch (time) {
            case "0745":
                prt2 = "00";
                break;
            case "0835":
                prt2 = "01";
                break;
            case "0925":
                prt2 = "02";
                break;
            case "1035":
                prt2 = "10";
                break;
            case "1125":
                prt2 = "11";
                break;
            case "1215":
                prt2 = "12";
                break;
            case "1415":
                prt2 = "20";
                break;
            case "1505":
                prt2 = "21";
                break;
            case "1555":
                prt2 = "22";
                break;
            default:
                prt2 = time;
                break;
        }


        String keys;
        keys = pos1 + prt2;
        return keys;
    }
}