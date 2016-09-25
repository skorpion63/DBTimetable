package com.example.skorpion.dbtimetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class fromCentral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

        final ArrayList<String> toCentral1 = new ArrayList<String>();

        toCentral1.add("Leaves at 6:30 am");
        toCentral1.add("Leaves at 7:00 am");
        toCentral1.add("Leaves at 7:20 am");
        toCentral1.add("Leaves at 7:40 am");
        toCentral1.add("Leaves at 8:00 am");
        toCentral1.add("Leaves at 8:20 am");
        toCentral1.add("Leaves at 8:40 am");
        toCentral1.add("Leaves at 9:10 am");
        toCentral1.add("Leaves at 9:40 am");
        toCentral1.add("Leaves at 10:10 am");
        toCentral1.add("Leaves at 10:40 am");
        toCentral1.add("Leaves at 11:10 am");
        toCentral1.add("Leaves at 11:40 am");
        toCentral1.add("Leaves at 12:10 pm");
        toCentral1.add("Leaves at 12:40 pm");
        toCentral1.add("Leaves at 1:10 pm");
        toCentral1.add("Leaves at 1:40 pm");
        toCentral1.add("Leaves at 2:10 pm");
        toCentral1.add("Leaves at 2:40 pm");
        toCentral1.add("Leaves at 3:10 pm");
        toCentral1.add("Leaves at 3:30 pm");
        toCentral1.add("Leaves at 3:50 pm");
        toCentral1.add("Leaves at 4:10 pm");
        toCentral1.add("Leaves at 4:40 pm");
        toCentral1.add("Leaves at 5:10 pm");
        toCentral1.add("Leaves at 5:40 pm");
        toCentral1.add("Leaves at 6:10 pm");
        toCentral1.add("Leaves at 6:30 pm");
        toCentral1.add("Leaves at 6:50 pm");
        toCentral1.add("Leaves at 7:10 pm");
        toCentral1.add("Leaves at 7:30 pm");
        toCentral1.add("Leaves at 8:00 pm");
        toCentral1.add("Leaves at 8:30 pm");
        toCentral1.add("Leaves at 9:00 pm");
        toCentral1.add("Leaves at 9:30 pm");
        toCentral1.add("Leaves at 10:00 pm");
        toCentral1.add("Leaves at 10:30 pm");
        toCentral1.add("Leaves at 11:00 pm");
        toCentral1.add("Leaves at 11:30 pm");
        toCentral1.add("Leaves at 12:00 am");
        toCentral1.add("Leaves at 12:30 am");
        toCentral1.add("Leaves at 1:00 am");
        toCentral1.add("Leaves at 2:00 am");
        toCentral1.add("Leaves at 3:30 am");
        toCentral1.add("Leaves at 5:00 am");

        customAdapter adapter = new customAdapter(this, toCentral1);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
