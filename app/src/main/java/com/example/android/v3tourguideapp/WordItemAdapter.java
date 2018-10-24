package com.example.android.v3tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordItemAdapter extends ArrayAdapter<WordItem> {

    /**
     * {@Link WordItemAdapter} is an {@Link ArrayAdapter} that can provide the layout for each
     * list item based on the data source, which is a list of {@Link WordItem} objects
     */

    /**
     * create a new {@Link WordItemAdapter} object
     * @param context is the current context (Activity) that the adapter is being created in
     * @param worditems is the list of {@Link WordItem} that is to be displayed
     * @param imageResourceId is the resource ID of the image that is to be displayed
     */
    public WordItemAdapter(Context context, ArrayList<WordItem> wordItems) {
        super(context, 0, wordItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /** check if an existing view is being reused, if not then inflate the view */
        View listItemView = convertView;
         if (listItemView == null) {
             listItemView = LayoutInflater.from(getContext()).inflate(
                     R.layout.list_item, parent, false);
         }

         /** get the {@Link WordItem} object located at this position in the list */
        WordItem currentWordItem = getItem(position);

        /** find the TextView in the list_item.xlm with the ID of item_name */
        TextView itemNameTextView = (TextView)listItemView.findViewById(R.id.item_name);

        /** get the current word item name from the currentWord object and set this text
         * in the item_name TextView
         */
        itemNameTextView.setText(currentWordItem.getItemName());

        /** get the {@Link WordItem} object located at this position in the list */
        WordItem currentAddressItem = getItem(position);

        /** find the TextView in the list_item.xlm with the ID of detail_item_one */
        TextView itemAddressTextView = (TextView)listItemView.findViewById(R.id.detail_item_one);

        /** get the current word item name from the currentWord object and set this text
         * in the detail_item_one TextView
         */
        itemAddressTextView.setText(currentAddressItem.getItemOne());

        /** get the {@Link WordItem} object located at this position in the list */
        WordItem currentPhoneItem = getItem(position);

        /** find the TextView in the list_item.xlm with the ID of detail_item_two */
        TextView itemPhoneTextView = (TextView)listItemView.findViewById(R.id.detail_item_two);

        /** get the current word item name from the currentWord object and set this text
         * in the detail_item_two TextView
         */
        itemPhoneTextView.setText(currentPhoneItem.getItemTwo());

        /** get the {@Link WordItem} object located at this position in the list */
        WordItem currentHoursItem = getItem(position);

        /** find the TextView in the list_item.xlm with the ID of detail_item_three */
        TextView itemHoursTextView = (TextView)listItemView.findViewById(R.id.detail_item_three);

        /** get the current word item name from the currentWord object and set this text
         * in the detail_item_three TextView
         */
        itemHoursTextView.setText(currentHoursItem.getItemThree());

        /** get the {@Link WordItem} object located at this position in the list */
        WordItem currentDescriptionItem = getItem(position);

        /** find the TextView in the list_item.xlm with the ID of detail_item_description */
        TextView itemDescriptionTextView = (TextView)listItemView.findViewById(R.id.detail_item_description);

        /** get the current word item name from the currentWord object and set this text
         * in the detail_item_description TextView
         */
        itemDescriptionTextView.setText(currentDescriptionItem.getItemDescription());

        /** find the ImageView in the list_item.xml with the ID of item_photo */
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.item_photo);

        /** get the current image from the currentWord object and set the image
         * in the item_photo ImageView
         */
        imageView.setImageResource(currentWordItem.getImageResourceId());

        /**
         * Return the whole list item layout (containing 5 text views and 1 image view so that
         * it can be shown in the ListView
         */
        return listItemView;
    }
}