package com.example.skorpion.dbtimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toCentral = (TextView) findViewById(R.id.ferryToCentral);



        toCentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_WEEK);

                switch (day) {


                    case Calendar.MONDAY:
                        // Current day is Monday

                    case Calendar.TUESDAY:
                        //

                    case Calendar.WEDNESDAY:
                        //

                    case Calendar.THURSDAY:
                        //

                    case Calendar.FRIDAY:
                        Intent toCentral = new Intent(MainActivity.this, toCentral.class);
                        startActivity(toCentral);
                        break;

                    case Calendar.SATURDAY:
                        //
                    case Calendar.SUNDAY:
                        Intent toCentralS = new Intent(MainActivity.this, toCentralSunday.class);
                        startActivity(toCentralS);
                        break;

                }

            }
        });


    }
}
