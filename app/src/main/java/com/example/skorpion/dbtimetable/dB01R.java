package com.example.skorpion.dbtimetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class dB01R extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

        final ArrayList<String> toCentral1 = new ArrayList<String>();

        toCentral1.add("Leaves at 5:30 am");
        toCentral1.add("Leaves at 6:00 am");
        toCentral1.add("Leaves at 6:35 am");
        toCentral1.add("Leaves at 6:50 am");
        toCentral1.add("Leaves at 7:00 am");
        toCentral1.add("Leaves at 7:10 am");
        toCentral1.add("Leaves at 7:15 am");
        toCentral1.add("Leaves at 7:20 am");
        toCentral1.add("Leaves at 7:25 am");
        toCentral1.add("Leaves at 7:35 am");
        toCentral1.add("Leaves at 7:45 am");
        toCentral1.add("Leaves at 7:55 am");
        toCentral1.add("Leaves at 8:05 am");
        toCentral1.add("Leaves at 8:15 am");
        toCentral1.add("Leaves at 8:25 am");
        toCentral1.add("Leaves at 8:35 am");
        toCentral1.add("Leaves at 8:45 am");
        toCentral1.add("Leaves at 9:00 am");
        toCentral1.add("Leaves at 9:15 am");
        toCentral1.add("Leaves at 9:30 am");
        toCentral1.add("Leaves at 9:45 am");
        toCentral1.add("Leaves at 10:00 am");
        toCentral1.add("Leaves at 10:15 am");
        toCentral1.add("Leaves at 10:30 am");
        toCentral1.add("Leaves at 10:45 am");
        toCentral1.add("Leaves at 11:00 am");
        toCentral1.add("Leaves at 11:15 am");
        toCentral1.add("Leaves at 11:30 am");
        toCentral1.add("Leaves at 11:45 am");
        toCentral1.add("Leaves at 12:00 pm");
        toCentral1.add("Leaves at 12:15 pm");
        toCentral1.add("Leaves at 12:30 pm");
        toCentral1.add("Leaves at 12:45 pm");
        toCentral1.add("Leaves at 1:00 pm");
        toCentral1.add("Leaves at 1:15 pm");
        toCentral1.add("Leaves at 1:30 pm");
        toCentral1.add("Leaves at 1:45 pm");
        toCentral1.add("Leaves at 2:00 pm");
        toCentral1.add("Leaves at 2:15 pm");
        toCentral1.add("Leaves at 2:30 pm");
        toCentral1.add("Leaves at 2:45 pm");
        toCentral1.add("Leaves at 3:00 pm");
        toCentral1.add("Leaves at 3:10 pm");
        toCentral1.add("Leaves at 3:20 pm");
        toCentral1.add("Leaves at 3:30 pm");
        toCentral1.add("Leaves at 3:45 pm");
        toCentral1.add("Leaves at 4:00 pm");
        toCentral1.add("Leaves at 4:15 pm");
        toCentral1.add("Leaves at 4:30 pm");
        toCentral1.add("Leaves at 4:45 pm");
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
        toCentral1.add("Leaves at 7:10 pm");
        toCentral1.add("Leaves at 7:20 pm");
        toCentral1.add("Leaves at 7:30 pm");
        toCentral1.add("Leaves at 7:40 pm");
        toCentral1.add("Leaves at 7:50 pm");
        toCentral1.add("Leaves at 8:00 pm");
        toCentral1.add("Leaves at 8:10 pm");
        toCentral1.add("Leaves at 8:20 pm");
        toCentral1.add("Leaves at 8:35 pm");
        toCentral1.add("Leaves at 8:50 pm");
        toCentral1.add("Leaves at 9:10 pm");
        toCentral1.add("Leaves at 9:30 pm");
        toCentral1.add("Leaves at 9:50 pm");
        toCentral1.add("Leaves at 10:10 pm");
        toCentral1.add("Leaves at 10:30 pm");
        toCentral1.add("Leaves at 10:50 pm");
        toCentral1.add("Leaves at 11:10 pm");
        toCentral1.add("Leaves at 11:30 pm");
        toCentral1.add("Leaves at 12:00 am");
        toCentral1.add("Leaves at 12:30 am");
        toCentral1.add("Leaves at 1:00 am");

        customAdapter adapter = new customAdapter(this, toCentral1);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
