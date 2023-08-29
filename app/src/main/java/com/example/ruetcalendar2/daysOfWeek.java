package com.example.ruetcalendar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class daysOfWeek extends AppCompatActivity {
    ListView listday;
    String days[];
    ArrayAdapter<String> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_of_week);

        listday=findViewById(R.id.daylist);
        days=getResources().getStringArray(R.array.days);
        adapter2= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,days);
        listday.setAdapter(adapter2);

        listday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int daypos = position;
                if (position==0) {
                    Intent ib = new Intent(daysOfWeek.this, Classtimes.class);
                    ib.putExtra("dayname", daypos);
                    startActivity(ib);
                }
                if (position==1) {
                    Intent ib = new Intent(daysOfWeek.this, Classtimes.class);
                    ib.putExtra("dayname", daypos);
                    startActivity(ib);
                }
                if (position==2) {
                    Intent ib = new Intent(daysOfWeek.this, Classtimes.class);
                    ib.putExtra("dayname", daypos);
                    startActivity(ib);
                }
                if (position==3) {
                    Intent ib = new Intent(daysOfWeek.this, Classtimes.class);
                    ib.putExtra("dayname", daypos);
                    startActivity(ib);
                }
                if (position==4) {
                    Intent ib = new Intent(daysOfWeek.this, Classtimes.class);
                    ib.putExtra("dayname", daypos);
                    startActivity(ib);
                }
                if (position==5) {
                    Intent ib = new Intent(daysOfWeek.this, Classtimes.class);
                    ib.putExtra("dayname", daypos);
                    startActivity(ib);
                }
            }
        });
    }
}