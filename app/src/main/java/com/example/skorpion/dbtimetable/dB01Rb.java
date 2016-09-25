package com.example.skorpion.dbtimetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class dB01Rb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

        final ArrayList<String> toCentral1 = new ArrayList<String>();

        toCentral1.add("Leaves at 5:55 am");
        toCentral1.add("Leaves at 6:25 am");
        toCentral1.add("Leaves at 6:55 am");
        toCentral1.add("Leaves at 7:10 am");
        toCentral1.add("Leaves at 7:20 am");
        toCentral1.add("Leaves at 7:30 am");
        toCentral1.add("Leaves at 7:35 am");
        toCentral1.add("Leaves at 7:40 am");
        toCentral1.add("Leaves at 7:45 am");
        toCentral1.add("Leaves at 7:55 am");
        toCentral1.add("Leaves at 8:05 am");
        toCentral1.add("Leaves at 8:15 am");
        toCentral1.add("Leaves at 8:25 am");
        toCentral1.add("Leaves at 8:35 am");
        toCentral1.add("Leaves at 8:45 am");
        toCentral1.add("Leaves at 8:55 am");
        toCentral1.add("Leaves at 9:05 am");
        toCentral1.add("Leaves at 9:20 am");
        toCentral1.add("Leaves at 9:35 am");
        toCentral1.add("Leaves at 9:50 am");
        toCentral1.add("Leaves at 10:05 am");
        toCentral1.add("Leaves at 10:20 am");
        toCentral1.add("Leaves at 10:35 am");
        toCentral1.add("Leaves at 10:50 am");
        toCentral1.add("Leaves at 11:05 am");
        toCentral1.add("Leaves at 11:20 am");
        toCentral1.add("Leaves at 11:35 am");
        toCentral1.add("Leaves at 11:50 am");
        toCentral1.add("Leaves at 12:05 pm");
        toCentral1.add("Leaves at 12:20 pm");
        toCentral1.add("Leaves at 12:35 pm");
        toCentral1.add("Leaves at 12:50 pm");
        toCentral1.add("Leaves at 1:05 pm");
        toCentral1.add("Leaves at 1:20 pm");
        toCentral1.add("Leaves at 1:35 pm");
        toCentral1.add("Leaves at 1:50 pm");
        toCentral1.add("Leaves at 2:05 pm");
        toCentral1.add("Leaves at 2:20 pm");
        toCentral1.add("Leaves at 2:35 pm");
        toCentral1.add("Leaves at 2:50 pm");
        toCentral1.add("Leaves at 3:05 pm");
        toCentral1.add("Leaves at 3:20 pm");
        toCentral1.add("Leaves at 3:30 pm");
        toCentral1.add("Leaves at 3:40 pm");
        toCentral1.add("Leaves at 3:50 pm");
        toCentral1.add("Leaves at 4:05 pm");
        toCentral1.add("Leaves at 4:20 pm");
        toCentral1.add("Leaves at 4:35 pm");
        toCentral1.add("Leaves at 4:50 pm");
        toCentral1.add("Leaves at 5:05 pm");
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
        toCentral1.add("Leaves at 7:10 pm");
        toCentral1.add("Leaves at 7:20 pm");
        toCentral1.add("Leaves at 7:30 pm");
        toCentral1.add("Leaves at 7:40 pm");
        toCentral1.add("Leaves at 7:50 pm");
        toCentral1.add("Leaves at 8:00 pm");
        toCentral1.add("Leaves at 8:10 pm");
        toCentral1.add("Leaves at 8:20 pm");
        toCentral1.add("Leaves at 8:30 pm");
        toCentral1.add("Leaves at 8:40 pm");
        toCentral1.add("Leaves at 8:55 pm");
        toCentral1.add("Leaves at 9:10 pm");
        toCentral1.add("Leaves at 9:30 pm");
        toCentral1.add("Leaves at 9:50 pm");
        toCentral1.add("Leaves at 10:10 pm");
        toCentral1.add("Leaves at 10:30 pm");
        toCentral1.add("Leaves at 10:50 pm");
        toCentral1.add("Leaves at 11:10 pm");
        toCentral1.add("Leaves at 11:30 pm");
        toCentral1.add("Leaves at 11:55 pm");
        toCentral1.add("Leaves at 12:25 am");
        toCentral1.add("Leaves at 12:55 am");
        toCentral1.add("Leaves at 1:25 am");

        customAdapter adapter = new customAdapter(this, toCentral1);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
