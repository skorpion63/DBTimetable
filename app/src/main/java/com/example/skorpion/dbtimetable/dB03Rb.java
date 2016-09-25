package com.example.skorpion.dbtimetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class dB03Rb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

        final ArrayList<String> toCentral1 = new ArrayList<String>();

        toCentral1.add("Leaves at 6:40 am");
        toCentral1.add("Leaves at 6:55 am");
        toCentral1.add("Leaves at 7:08 am");
        toCentral1.add("Leaves at 7:20 am");
        toCentral1.add("Leaves at 7:30 am");
        toCentral1.add("Leaves at 7:40 am");
        toCentral1.add("Leaves at 7:50 am");
        toCentral1.add("Leaves at 7:55 am");
        toCentral1.add("Leaves at 8:05 am");
        toCentral1.add("Leaves at 8:15 am");
        toCentral1.add("Leaves at 8:25 am");
        toCentral1.add("Leaves at 8:30 am");
        toCentral1.add("Leaves at 8:35 am");
        toCentral1.add("Leaves at 8:45 am");
        toCentral1.add("Leaves at 8:55 am");
        toCentral1.add("Leaves at 9:00 am");
        toCentral1.add("Leaves at 9:10 am");
        toCentral1.add("Leaves at 9:20 am");
        toCentral1.add("Leaves at 9:30 am");
        toCentral1.add("Leaves at 9:40 am");
        toCentral1.add("Leaves at 9:55 am");
        toCentral1.add("Leaves at 10:10 am");
        toCentral1.add("Leaves at 10:25 am");
        toCentral1.add("Leaves at 10:40 am");
        toCentral1.add("Leaves at 10:55 am");
        toCentral1.add("Leaves at 11:10 am");
        toCentral1.add("Leaves at 11:30 am");
        toCentral1.add("Leaves at 11:50 am");
        toCentral1.add("Leaves at 12:10 pm");
        toCentral1.add("Leaves at 12:30 pm");
        toCentral1.add("Leaves at 12:50 pm");
        toCentral1.add("Leaves at 1:10 pm");
        toCentral1.add("Leaves at 1:30 pm");
        toCentral1.add("Leaves at 1:50 pm");
        toCentral1.add("Leaves at 2:10 pm");
        toCentral1.add("Leaves at 2:30 pm");
        toCentral1.add("Leaves at 2:50 pm");
        toCentral1.add("Leaves at 3:10 pm");
        toCentral1.add("Leaves at 3:30 pm");
        toCentral1.add("Leaves at 3:50 pm");
        toCentral1.add("Leaves at 4:10 pm");
        toCentral1.add("Leaves at 4:30 pm");
        toCentral1.add("Leaves at 4:50 pm");
        toCentral1.add("Leaves at 5:10 pm");
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
        toCentral1.add("Leaves at 7:10 pm");
        toCentral1.add("Leaves at 7:20 pm");
        toCentral1.add("Leaves at 7:30 pm");
        toCentral1.add("Leaves at 7:42 pm");
        toCentral1.add("Leaves at 7:54 pm");
        toCentral1.add("Leaves at 8:06 pm");
        toCentral1.add("Leaves at 8:18 pm");
        toCentral1.add("Leaves at 8:30 pm");
        toCentral1.add("Leaves at 8:42 pm");
        toCentral1.add("Leaves at 8:54 pm");
        toCentral1.add("Leaves at 9:06 pm");
        toCentral1.add("Leaves at 9:18 pm");
        toCentral1.add("Leaves at 9:30 pm");
        toCentral1.add("Leaves at 9:45 pm");
        toCentral1.add("Leaves at 10:00 pm");
        toCentral1.add("Leaves at 10:15 pm");
        toCentral1.add("Leaves at 10:30 pm");
        toCentral1.add("Leaves at 10:45 pm");
        toCentral1.add("Leaves at 11:00 pm");
        toCentral1.add("Leaves at 11:15 pm");
        toCentral1.add("Leaves at 11:30 pm");
        toCentral1.add("Leaves at 11:45 pm");
        toCentral1.add("Leaves at 12:00 am");
        toCentral1.add("Leaves at 12:15 am");
        toCentral1.add("Leaves at 12:32 am");
        toCentral1.add("Leaves at 1:12 am");


        customAdapter adapter = new customAdapter(this, toCentral1);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
