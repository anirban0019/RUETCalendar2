package com.example.ruetcalendar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SetRoutine extends AppCompatActivity {
    TextView text1,text2,text3;
    EditText editText;
    Button button1;
    String timess[];
    String workday[];
    String clsperiod[];

    void dataSave(String key,String data)
    {
        SharedPreferences sharedPreferences=getSharedPreferences("Routine", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(key,data);
        editor.commit();
        DataDialog dialog= new DataDialog(data);
        dialog.show(getSupportFragmentManager(), dialog.getTag());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_routine);

        text1=findViewById(R.id.textView6);
        text2=findViewById(R.id.textView5);
        text3=findViewById(R.id.textView4);
        editText=findViewById(R.id.editTextTextMultiLine);
        button1=findViewById(R.id.button);
        workday=getResources().getStringArray(R.array.days);

        Intent ie= getIntent();
        int dayval=ie.getIntExtra("daypos",0);
        int daypri=ie.getIntExtra("daytperi",0);
        int clstime=ie.getIntExtra("daytime",0);

        if (dayval==0)
        {
            text2.setText(workday[dayval]);
            if (daypri==0)
            {
                timess=getResources().getStringArray(R.array.Morning);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="000";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();
                        }
                    });

                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="001";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="002";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
            }
            if (daypri==1)
            {
                timess=getResources().getStringArray(R.array.Noon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="010";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="011";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="012";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
            }
            if (daypri==2)
            {
                timess=getResources().getStringArray(R.array.Afternoon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="020";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="021";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="022";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
            }
        }
        if (dayval==1)
        {
            text2.setText(workday[dayval]);
            if (daypri==0)
            {
                timess=getResources().getStringArray(R.array.Morning);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="100";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="101";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="102";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
            }
            if (daypri==1)
            {
                timess=getResources().getStringArray(R.array.Noon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="110";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="111";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="112";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
            }
            if (daypri==2)
            {
                timess=getResources().getStringArray(R.array.Afternoon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="120";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="121";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="122";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });

                }
            }
        }
        if (dayval==2)
        {
            text2.setText(workday[dayval]);
            if (daypri==0)
            {
                timess=getResources().getStringArray(R.array.Morning);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="200";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="201";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="202";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
            if (daypri==1)
            {
                timess=getResources().getStringArray(R.array.Noon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="210";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="211";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="212";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
            if (daypri==2)
            {
                timess=getResources().getStringArray(R.array.Afternoon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="220";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="221";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="222";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
        }
        if (dayval==3)
        {
            text2.setText(workday[dayval]);
            if (daypri==0)
            {
                timess=getResources().getStringArray(R.array.Morning);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="300";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="301";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            String key="302";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
            if (daypri==1)
            {
                timess=getResources().getStringArray(R.array.Noon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="310";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="311";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="312";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
            if (daypri==2)
            {
                timess=getResources().getStringArray(R.array.Afternoon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="320";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="321";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="322";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
        }
        if (dayval==4)
        {
            text2.setText(workday[dayval]);
            if (daypri==0)
            {
                timess=getResources().getStringArray(R.array.Morning);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="400";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="401";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="402";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
            if (daypri==1)
            {
                timess=getResources().getStringArray(R.array.Noon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="410";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="411";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="412";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
            if (daypri==2)
            {
                timess=getResources().getStringArray(R.array.Afternoon);
                if (clstime==0)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="420";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==1)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="421";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
                if (clstime==2)
                {
                    text3.setText(timess[clstime]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String key="422";
                            String data=editText.getText().toString();
                            dataSave(key,data);
                            Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }
        }

    }
}