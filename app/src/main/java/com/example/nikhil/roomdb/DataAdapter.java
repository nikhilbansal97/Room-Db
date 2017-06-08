package com.example.nikhil.roomdb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nikhil on 7/6/17.
 */

public class DataAdapter extends ArrayAdapter<DataModel> {

    public DataAdapter(@NonNull Context context, @NonNull List<DataModel> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;

        if(listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        DataModel currentItem = getItem(position);

        TextView item_text = (TextView) listItem.findViewById(R.id.item_text);
        item_text.setText(currentItem.getItemName());

        TextView person_text = (TextView) listItem.findViewById(R.id.person_text);
        person_text.setText(currentItem.getPersonName());

        return listItem;
    }
}
