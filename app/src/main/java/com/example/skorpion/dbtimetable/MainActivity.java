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


        /* Code for ferry to central schedule. */

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
                        Intent toCentralSat = new Intent(MainActivity.this, toCentralSaturday.class);
                        startActivity(toCentralSat);
                        break;
                        //
                    case Calendar.SUNDAY:
                        Intent toCentralS = new Intent(MainActivity.this, toCentralSunday.class);
                        startActivity(toCentralS);
                        break;

                }

            }
        });


        /* Code for ferry from central schedule. */

        TextView fromCentral = (TextView) findViewById(R.id.ferryFromCentral);


        fromCentral.setOnClickListener(new View.OnClickListener() {
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
                        Intent fromCentral = new Intent(MainActivity.this, fromCentral.class);
                        startActivity(fromCentral);
                        break;

                    case Calendar.SATURDAY:
                        Intent fromCentralSat = new Intent(MainActivity.this, fromCentralSaturday.class);
                        startActivity(fromCentralSat);
                        break;
                        //
                    case Calendar.SUNDAY:
                        Intent fromCentralS = new Intent(MainActivity.this, fromCentralSunday.class);
                        startActivity(fromCentralS);
                        break;

                }

            }
        });


        /* Code for bus to TungChung */

        TextView toTungChung = (TextView) findViewById(R.id.db01);
        toTungChung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTungChung = new Intent(MainActivity.this, dB01R.class);
                startActivity(toTungChung);
            }
        });


        /* Code for bus from TungChung */

        TextView fromTungChung = (TextView) findViewById(R.id.db01b);
        fromTungChung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fromTungChung = new Intent(MainActivity.this, dB01Rb.class);
                startActivity(fromTungChung);
            }
        });


        /* Code for bus to Airport */

        TextView toAirport = (TextView) findViewById(R.id.db02);
        toAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toAirport = new Intent(MainActivity.this, dB02R.class);
                startActivity(toAirport);
            }
        });

        /* Code for bus from Airport */

        TextView fromAirport = (TextView) findViewById(R.id.db02b);
        fromAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fromAirport = new Intent(MainActivity.this, dB02Rb.class);
                startActivity(fromAirport);
            }
        });


        /* Code for bus to Sunny Bay */

        TextView toSunnyBay = (TextView) findViewById(R.id.db03);
        toSunnyBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSunnyBay = new Intent(MainActivity.this, dB03R.class);
                startActivity(toSunnyBay);
            }
        });

        /* Code for bus from SunnyBay */

        TextView fromSunnyBay = (TextView) findViewById(R.id.db03b);
        fromSunnyBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fromSunnyBay = new Intent(MainActivity.this, dB03Rb.class);
                startActivity(fromSunnyBay);
            }
        });




    }
}
