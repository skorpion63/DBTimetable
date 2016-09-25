package com.example.skorpion.dbtimetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class dB02R extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

        final ArrayList<String> toCentral1 = new ArrayList<String>();

        toCentral1.add("Leaves at 12:00 am");
        toCentral1.add("Leaves at 12:30 am");
        toCentral1.add("Leaves at 1:00 am");
        toCentral1.add("Leaves at 2:00 am");
        toCentral1.add("Leaves at 3:00 am");
        toCentral1.add("Leaves at 4:00 am");
        toCentral1.add("Leaves at 5:00 am");
        toCentral1.add("Leaves at 5:30 am");
        toCentral1.add("Leaves at 6:00 am");
        toCentral1.add("Leaves at 6:30 am");
        toCentral1.add("Leaves at 7:00 am");
        toCentral1.add("Leaves at 7:30 am");
        toCentral1.add("Leaves at 8:00 am");
        toCentral1.add("Leaves at 8:30 am");
        toCentral1.add("Leaves at 9:00 am");
        toCentral1.add("Leaves at 9:30 am");
        toCentral1.add("Leaves at 10:00 am");
        toCentral1.add("Leaves at 10:30 am");
        toCentral1.add("Leaves at 11:00 am");
        toCentral1.add("Leaves at 11:30 am");
        toCentral1.add("Leaves at 12:00 pm");
        toCentral1.add("Leaves at 12:30 pm");
        toCentral1.add("Leaves at 1:00 pm");
        toCentral1.add("Leaves at 1:30 pm");
        toCentral1.add("Leaves at 2:00 pm");
        toCentral1.add("Leaves at 2:30 pm");
        toCentral1.add("Leaves at 3:00 pm");
        toCentral1.add("Leaves at 3:30 pm");
        toCentral1.add("Leaves at 4:00 pm");
        toCentral1.add("Leaves at 4:30 pm");
        toCentral1.add("Leaves at 5:00 pm");
        toCentral1.add("Leaves at 5:30 pm");
        toCentral1.add("Leaves at 6:00 pm");
        toCentral1.add("Leaves at 6:30 pm");
        toCentral1.add("Leaves at 7:00 pm");
        toCentral1.add("Leaves at 7:30 pm");
        toCentral1.add("Leaves at 8:00 pm");
        toCentral1.add("Leaves at 8:30 pm");
        toCentral1.add("Leaves at 9:00 pm");
        toCentral1.add("Leaves at 9:30 pm");
        toCentral1.add("Leaves at 10:00 pm");
        toCentral1.add("Leaves at 10:30 pm");
        toCentral1.add("Leaves at 11:00 pm");
        toCentral1.add("Leaves at 11:30 pm");


        customAdapter adapter = new customAdapter(this, toCentral1);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
