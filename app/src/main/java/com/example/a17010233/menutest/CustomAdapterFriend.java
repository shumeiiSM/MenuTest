package com.example.a17010233.menutest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010233 on 7/1/2019.
 */

public class CustomAdapterFriend extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<FriendItem> fList;

    public CustomAdapterFriend(@NonNull Context context, int resource, @NonNull ArrayList<FriendItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        fList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvNum = rowView.findViewById(R.id.textViewNum);
        ImageView ivGender = rowView.findViewById(R.id.imageViewGender);

        FriendItem currentItem = fList.get(position);
        tvName.setText(currentItem.getName());
        tvNum.setText(currentItem.getNumber());

        if(currentItem.isGender()) {
            ivGender.setImageResource(R.drawable.ic_female);
        } else {
            ivGender.setImageResource(R.drawable.ic_male);
        }

        return rowView;
    }
}
