package com.example.ruetcalendar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Classtimes extends AppCompatActivity {
    TextView daytext;
    ListView clstimes;
    String clastimes[];
    String dayss[];
    ArrayAdapter<String> adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classtimes);

        clstimes= findViewById(R.id.listoftimes);
        clastimes = getResources().getStringArray(R.array.ClassTime);
        dayss= getResources().getStringArray(R.array.days);
        daytext =findViewById(R.id.textView);

        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,clastimes);
        clstimes.setAdapter(adapter3);
        Intent ib= getIntent();
        int dayval= ib.getIntExtra("dayname",0);
        daytext.setText(dayss[dayval]);
        clstimes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    int daytimpos= position;
                    Intent ic = new Intent(Classtimes.this, Timeset.class);
                    ic.putExtra("daytime", daytimpos );
                    ic.putExtra("daypos",dayval);
                    startActivity(ic);
                }
                if (position==1) {
                    int daytimpos= position;
                    Intent ic = new Intent(Classtimes.this, Timeset.class);
                    ic.putExtra("daytime", daytimpos );
                    ic.putExtra("daypos",dayval);
                    startActivity(ic);
                }if (position==2) {
                    int daytimpos= position;
                    Intent ic = new Intent(Classtimes.this, Timeset.class);
                    ic.putExtra("daytime", daytimpos );
                    ic.putExtra("daypos",dayval);
                    startActivity(ic);
                }
            }
        });

    }
}