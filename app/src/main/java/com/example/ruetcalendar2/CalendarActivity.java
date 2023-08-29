package com.example.ruetcalendar2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.applandeo.materialcalendarview.CalendarView;

import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class CalendarActivity extends AppCompatActivity {

    CalendarView calendarView;
    Button add, showrout, clear;
    ArrayList<String> events;

    void dataSave(String key,String data)
    {
        SharedPreferences sharedPreferences=getSharedPreferences("Routine", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(key,data);
        editor.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calander);
        events = new ArrayList<>();

        calendarView = findViewById(R.id.calendar);
        add = findViewById(R.id.button3);
        showrout = findViewById(R.id.button4);
        clear = findViewById(R.id.button2);

        OffsetDateTime dateTime = OffsetDateTime.now();
        int day = dateTime.getDayOfMonth();
        int month = dateTime.getMonthValue() - 1;
        int year = dateTime.getYear();

        List<Calendar> calendars = new ArrayList<>();

        for (int k = 2017; k <= year; k++) {
            int obp = 0;
            if (k == year) {
                obp = month;
            } else {
                obp = 11;
            }
            for (int j = 0; j <= obp; j++) {
                int bp = 0;
                if (month == j && k == year) {
                    bp = day;
                } else {
                    bp = 32;
                }
                for (int i = 1; i < bp; i++) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(k, j, i);
                    calendars.add(calendar);
                }
            }
        }

        calendarView.setDisabledDays(calendars);

        calendarView.setOnDayClickListener(date -> {
            SimpleDateFormat ft = new SimpleDateFormat("u", Locale.getDefault());
            String stringDate = ft.format(date.getCalendar().getTime());
            switch (stringDate) {
                case "6":
                    stringDate = "0";
                    break;
                case "7":
                    stringDate = "1";
                    break;
                case "1":
                    stringDate = "2";
                    break;
                case "2":
                    stringDate = "3";
                    break;
                case "3":
                    stringDate = "4";
                    break;
                case "4":
                    stringDate = "5";
                    break;
                case "5":
                    stringDate = "6";
                    break;
            }
            ArrayList<String> keys = new ArrayList<>(Arrays.asList("00", "01", "02", "10", "11", "12", "20", "21", "22"));

            String[] times = getResources().getStringArray(R.array.Alltimes);
            SharedPreferences sharedPreferences = getSharedPreferences("Routine", Context.MODE_PRIVATE);
            events.clear();
            for (int i = 0; i < 9; i++) {
                String key = stringDate + keys.get(i);
                String res = sharedPreferences.getString(key, "");
                if (!res.equals("")) {
                    events.add(times[i] + " : " + res);
                }

            }
            if (events.size() == 0) {
                Toast.makeText(this, "No class today!", Toast.LENGTH_SHORT).show();
            } else {
                ClassDialog dialog = new ClassDialog(events);
                dialog.show(getSupportFragmentManager(), dialog.getTag());
            }


        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CalendarActivity.this, daysOfWeek.class);
                startActivity(i);
            }
        });
        showrout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalendarActivity.this, ShowRoutine.class);
                startActivity(intent);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myalert= new AlertDialog.Builder(CalendarActivity.this);
                myalert.setTitle("Clear Routine");
                myalert.setMessage("Do you want to clear full routine?");
                myalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for (int i=0;i<=4;i++)
                        {
                            for (int j =0;j<=2; j++)
                            {
                                for (int k=0; k<=2; k++)
                                {
                                    String p1= i+"";
                                    String p2= j+"";
                                    String p3 =k+"";
                                    String key=p1+p2+p3;
                                    String data="";
                                    dataSave(key,data);

                                }
                            }
                        }
                        Toast.makeText(getApplicationContext(),"All routine has been cleared",Toast.LENGTH_SHORT).show();

                    }
                });
                myalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Routine clearing canceled",Toast.LENGTH_SHORT).show();

                    }
                });
                myalert.show();

            }
        });

    }
}


