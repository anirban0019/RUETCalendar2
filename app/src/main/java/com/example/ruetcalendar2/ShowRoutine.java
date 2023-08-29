package com.example.ruetcalendar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ShowRoutine extends AppCompatActivity {
    EditText showtext;
    Spinner spinner1,spinner2,spinner3;
    Button button;
    ArrayAdapter adapter1;
    ArrayAdapter adapter2;
    ArrayAdapter adapter3;
    String days[],periods[],times[];
    String pos1,pos3,pos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_routine);

        showtext=findViewById(R.id.showtextss);
        days=getResources().getStringArray(R.array.days);
        periods=getResources().getStringArray(R.array.ClassTime);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        button=findViewById(R.id.ok);

       spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               pos1=Integer.toString(position);

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
       spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(position==0)
               {
                   pos2="00";
               }
               if(position==1)
               {
                   pos2="01";
               }
               if(position==2)
               {
                   pos2="02";
               }
               if(position==3)
               {
                   pos2="10";
               }
               if(position==4){pos2="11";}
               if(position==5){pos2="12";}
               if(position==6){pos2="20";}
               if(position==7){pos2="21";}
               if(position==8){pos2="22";}


           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               pos3=pos1+pos2;

               SharedPreferences sharedPreferences=getSharedPreferences("Routine", Context.MODE_PRIVATE);
               SharedPreferences.Editor editor1=sharedPreferences.edit();
               String value=sharedPreferences.getString(pos3,"");
               showtext.setText(value);

           }
       });

    }
}





