package com.example.ruetcalendar2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //public static LocalDate selectedate;
    CalendarView calendar;
    Button addroutine,showrout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar=findViewById(R.id.calendarView);
        calendar.setDate(Calendar.getInstance().getTimeInMillis(),false,true);
        calendar.setFirstDayOfWeek(7);



        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), "You have selected "+ dayOfMonth +"/"+ (month+1) +"/"+year, Toast.LENGTH_SHORT).show();
            }
        });
        addroutine=findViewById(R.id.addrutine);
        addroutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,RoutineType.class);
                startActivity(i);
            }
        });

        showrout=findViewById(R.id.showroutinee);
        showrout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ShowRoutine.class);
                startActivity(intent);
            }
        });

        }


    }