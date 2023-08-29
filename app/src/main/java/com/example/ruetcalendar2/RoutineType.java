package com.example.ruetcalendar2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RoutineType extends AppCompatActivity {
    ListView list;
    String typeOfRoutine[];
    ArrayAdapter<String> adapter;

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
        setContentView(R.layout.activity_routine_type);

        list=findViewById(R.id.listofroutine);
        typeOfRoutine=getResources().getStringArray(R.array.typeofroutine);
        adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,typeOfRoutine);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent ia= new Intent(RoutineType.this,daysOfWeek.class);
                    startActivity(ia);
                }
                else if (position==1)
                {

                    for (int i=0;i<=2;i++)
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


                }
            }
        });
    }
}