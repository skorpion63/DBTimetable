package com.example.skorpion.dbtimetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class dB03R extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

        final ArrayList<String> toCentral1 = new ArrayList<String>();

        toCentral1.add("Leaves at 6:15 am");
        toCentral1.add("Leaves at 6:30 am");
        toCentral1.add("Leaves at 6:43 am");
        toCentral1.add("Leaves at 6:55 am");
        toCentral1.add("Leaves at 7:05 am");
        toCentral1.add("Leaves at 7:15 am");
        toCentral1.add("Leaves at 7:25 am");
        toCentral1.add("Leaves at 7:30 am");
        toCentral1.add("Leaves at 7:35 am");
        toCentral1.add("Leaves at 7:45 am");
        toCentral1.add("Leaves at 7:55 am");
        toCentral1.add("Leaves at 8:00 am");
        toCentral1.add("Leaves at 8:05 am");
        toCentral1.add("Leaves at 8:15 am");
        toCentral1.add("Leaves at 8:20 am");
        toCentral1.add("Leaves at 8:30 am");
        toCentral1.add("Leaves at 8:40 am");
        toCentral1.add("Leaves at 8:50 am");
        toCentral1.add("Leaves at 9:00 am");
        toCentral1.add("Leaves at 9:10 am");
        toCentral1.add("Leaves at 9:25 am");
        toCentral1.add("Leaves at 9:40 am");
        toCentral1.add("Leaves at 9:55 am");
        toCentral1.add("Leaves at 10:10 am");
        toCentral1.add("Leaves at 10:25 am");
        toCentral1.add("Leaves at 10:40 am");
        toCentral1.add("Leaves at 11:00 am");
        toCentral1.add("Leaves at 11:20 am");
        toCentral1.add("Leaves at 11:40 am");
        toCentral1.add("Leaves at 12:00 pm");
        toCentral1.add("Leaves at 12:20 pm");
        toCentral1.add("Leaves at 12:40 pm");
        toCentral1.add("Leaves at 1:00 pm");
        toCentral1.add("Leaves at 1:20 pm");
        toCentral1.add("Leaves at 1:40 pm");
        toCentral1.add("Leaves at 2:00 pm");
        toCentral1.add("Leaves at 2:20 pm");
        toCentral1.add("Leaves at 2:40 pm");
        toCentral1.add("Leaves at 3:00 pm");
        toCentral1.add("Leaves at 3:20 pm");
        toCentral1.add("Leaves at 3:40 pm");
        toCentral1.add("Leaves at 4:00 pm");
        toCentral1.add("Leaves at 4:20 pm");
        toCentral1.add("Leaves at 4:40 pm");
        toCentral1.add("Leaves at 5:00 pm");
        toCentral1.add("Leaves at 5:10 pm");
        toCentral1.add("Leaves at 5:20 pm");
        toCentral1.add("Leaves at 5:30 pm");
        toCentral1.add("Leaves at 5:40 pm");
        toCentral1.add("Leaves at 5:50 pm");
        toCentral1.add("Leaves at 6:00 pm");
        toCentral1.add("Leaves at 6:10 pm");
        toCentral1.add("Leaves at 6:20 pm");
        toCentral1.add("Leaves at 6:30 pm");
        toCentral1.add("Leaves at 6:40 pm");
        toCentral1.add("Leaves at 6:50 pm");
        toCentral1.add("Leaves at 7:00 pm");
        toCentral1.add("Leaves at 7:12 pm");
        toCentral1.add("Leaves at 7:24 pm");
        toCentral1.add("Leaves at 7:36 pm");
        toCentral1.add("Leaves at 7:48 pm");
        toCentral1.add("Leaves at 8:00 pm");
        toCentral1.add("Leaves at 8:12 pm");
        toCentral1.add("Leaves at 8:24 pm");
        toCentral1.add("Leaves at 8:36 pm");
        toCentral1.add("Leaves at 8:48 pm");
        toCentral1.add("Leaves at 9:00 pm");
        toCentral1.add("Leaves at 9:15 pm");
        toCentral1.add("Leaves at 9:30 pm");
        toCentral1.add("Leaves at 9:45 pm");
        toCentral1.add("Leaves at 10:00 pm");
        toCentral1.add("Leaves at 10:15 pm");
        toCentral1.add("Leaves at 10:30 pm");
        toCentral1.add("Leaves at 10:45 pm");
        toCentral1.add("Leaves at 11:00 pm");
        toCentral1.add("Leaves at 11:12 pm");
        toCentral1.add("Leaves at 11:25 pm");
        toCentral1.add("Leaves at 11:37 pm");
        toCentral1.add("Leaves at 11:50 pm");
        toCentral1.add("Leaves at 12:05 am");
        toCentral1.add("Leaves at 12:20 am");


        customAdapter adapter = new customAdapter(this, toCentral1);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
