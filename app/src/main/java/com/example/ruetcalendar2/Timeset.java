package com.example.ruetcalendar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Timeset extends AppCompatActivity {
    TextView day, peiod;
    String time[];
    String dayy[];
    String period[];
    ListView list2;
    ArrayAdapter adapter4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeset);

        day=findViewById(R.id.textView2);
        peiod=findViewById(R.id.textView3);
        dayy=getResources().getStringArray(R.array.days);
        period=getResources().getStringArray(R.array.ClassTime);
        list2=findViewById(R.id.listTime);

        Intent ic=getIntent();
        int dayval= ic.getIntExtra("daypos",0);
        day.setText(dayy[dayval]);
        int perival= ic.getIntExtra("daytime",0);
        peiod.setText(period[perival]);

        if(perival==0)
        {
            time= getResources().getStringArray(R.array.Morning);

            adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,time);
            list2.setAdapter(adapter4);
            list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position==0) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                    if (position==1) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                    if (position==2) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                }
            });

        }
        else if(perival==1)
        {
            time= getResources().getStringArray(R.array.Noon);

            adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,time);
            list2.setAdapter(adapter4);
            list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position==0) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                    if (position==1) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                    if (position==2) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                }
            });

        }
        else if (perival==2)
        {
            time= getResources().getStringArray(R.array.Afternoon);

            adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,time);
            list2.setAdapter(adapter4);
            list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position==0) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                    if (position==1) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                    if (position==2) {
                        int timepos= position;
                        Intent ie = new Intent(Timeset.this, SetRoutine.class);
                        ie.putExtra("daytperi", perival );
                        ie.putExtra("daypos",dayval);
                        ie.putExtra("daytime",timepos);
                        startActivity(ie);
                    }
                }
            });

        }

    }
}