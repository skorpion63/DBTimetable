package com.example.skorpion.dbtimetable;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jangjeet on 25/09/16.
 */

public class customAdapter extends ArrayAdapter<String> {

    public customAdapter(Activity context, ArrayList<String> toCentral1) {
        super(context, 0, toCentral1);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.customlist, parent, false);

        }

        String currentString = getItem(position);
        TextView time = (TextView) listItemView.findViewById(R.id.scde);
        time.setText(currentString);

        return listItemView;
    }

}
