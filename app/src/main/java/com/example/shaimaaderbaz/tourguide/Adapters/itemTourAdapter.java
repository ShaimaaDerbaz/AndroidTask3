package com.example.shaimaaderbaz.tourguide.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shaimaaderbaz.tourguide.R;
import com.example.shaimaaderbaz.tourguide.itemTour;

import java.util.ArrayList;

/**
 * Created by Shaimaa Derbaz on 1/3/2018.
 */

public class itemTourAdapter extends ArrayAdapter<itemTour> {

    public itemTourAdapter(Activity context, ArrayList<itemTour> images) {

        super(context, 0, images);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(
                    getContext()).inflate(R.layout.item_list, null, false);

        }
        itemTour currentItem = getItem(position);
        TextView nameItemTextView=(TextView)listItemView.findViewById(R.id.item_name_text_view);
        nameItemTextView.setText(currentItem.getItemName());
        TextView aboutItemTextView = (TextView) listItemView.findViewById(R.id.item_about_text_view);
        aboutItemTextView.setText(currentItem.getItemAbout());
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.item_image_image_view);
        itemImageView.setImageResource(currentItem.getImageId());


        return listItemView;
    }

}
