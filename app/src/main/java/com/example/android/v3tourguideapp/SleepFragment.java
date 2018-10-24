package com.example.android.v3tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/** A simple {@link Fragment} subclass. */
public class SleepFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** Create a list of items */
        final ArrayList<WordItem> wordItems = new ArrayList<WordItem>();
        wordItems.add(new WordItem(getString(R.string.palazzo_manfredi_name), getString(R.string.palazzo_manfredi_address),
                getString(R.string.palazzo_manfredi_phone), getString(R.string.palazzo_manfredi_website),
                getString(R.string.palazzo_manfredi_description), R.drawable.hotel_palazzo_manfredi_final));
        wordItems.add(new WordItem(getString(R.string.palazzo_montemartini_name), getString(R.string.palazzo_montemartini_address),
                getString(R.string.palazzo_montemartini_phone), getString(R.string.palazzo_montemartini_website),
                getString(R.string.palazzo_montemartini_description), R.drawable.hotel_palazzo_montemartini_final));
        wordItems.add(new WordItem(getString(R.string.iq_hotel_roma_name), getString(R.string.iq_hotel_roma_address),
                getString(R.string.iq_hotel_roma_phone), getString(R.string.iq_hotel_roma_website),
                getString(R.string.iq_hotel_roma_description), R.drawable.hotel_iq_roma_final));
        wordItems.add(new WordItem(getString(R.string.voi_donna_camilla_savelli_name), getString(R.string.voi_donna_camilla_savelli_address),
                getString(R.string.voi_donna_camilla_savelli_phone), getString(R.string.voi_donna_camilla_savelli_website),
                getString(R.string.voi_donna_camilla_savelli_description), R.drawable.hotel_voi_donna_camilla_final));
        wordItems.add(new WordItem(getString(R.string.britannia_hotel_name), getString(R.string.britannia_hotel_address),
                getString(R.string.britannia_hotel_phone), getString(R.string.britannia_hotel_website),
                getString(R.string.britannia_hotel_description), R.drawable.hotel_britannia_final));
        wordItems.add(new WordItem(getString(R.string.hotel_santa_maria_name), getString(R.string.hotel_santa_maria_address),
                getString(R.string.hotel_santa_maria_phone), getString(R.string.hotel_santa_maria_website),
                getString(R.string.hotel_santa_maria_description), R.drawable.hotel_santa_maria_final));
        wordItems.add(new WordItem(getString(R.string.cardilli_luxury_rooms_name), getString(R.string.cardilli_luxury_rooms_address),
                getString(R.string.cardilli_luxury_rooms_phone), getString(R.string.cardilli_luxury_rooms_website),
                getString(R.string.cardilli_luxury_rooms_description), R.drawable.hotel_cardilli_luxury_final));
        wordItems.add(new WordItem(getString(R.string.martis_palace_hotel_name), getString(R.string.martis_palace_hotel_address),
                getString(R.string.martis_palace_hotel_phone), getString(R.string.martis_palace_hotel_website),
                getString(R.string.martis_palace_hotel_description), R.drawable.hotel_martis_palace_final));
        wordItems.add(new WordItem(getString(R.string.campo_marzio_luxury_suites_name), getString(R.string.campo_marzio_luxury_suites_address),
                getString(R.string.campo_marzio_luxury_suites_phone), getString(R.string.campo_marzio_luxury_suites_website),
                getString(R.string.campo_marzio_luxury_suites_description), R.drawable.hotel_campo_marzio_luxury_final));
        wordItems.add(new WordItem(getString(R.string.mamas_home_name), getString(R.string.mamas_home_address),
                getString(R.string.mamas_home_phone), getString(R.string.mamas_home_website),
                getString(R.string.mamas_home_description), R.drawable.hotel_mamas_home_final));
        wordItems.add(new WordItem(getString(R.string.rome_life_hotel_name), getString(R.string.rome_life_hotel_address),
                getString(R.string.rome_life_hotel_phone), getString(R.string.rome_life_hotel_website),
                getString(R.string.rome_life_hotel_description), R.drawable.hotel_rome_life_final));
        wordItems.add(new WordItem(getString(R.string.inn_at_roman_forum_name), getString(R.string.inn_at_roman_forum_address),
                getString(R.string.inn_at_roman_forum_phone), getString(R.string.inn_at_roman_forum_website),
                getString(R.string.inn_at_roman_forum_description), R.drawable.hotel_inn_at_roman_forum_final));
        wordItems.add(new WordItem(getString(R.string.hotel_raphael_name), getString(R.string.hotel_raphael_address),
                getString(R.string.hotel_raphael_phone), getString(R.string.hotel_raphael_website),
                getString(R.string.hotel_raphael_description), R.drawable.hotel_raphael_final));
        wordItems.add(new WordItem(getString(R.string.nh_collection_cinquecento_name), getString(R.string.nh_collection_cinquecento_address),
                getString(R.string.nh_collection_cinquecento_phone), getString(R.string.nh_collection_cinquecento_website),
                getString(R.string.nh_collection_cinquecento_description), R.drawable.hotel_nh_collection_palazzo_cinquecento_final));
        wordItems.add(new WordItem(getString(R.string.pantheon_caesar_relais_name), getString(R.string.pantheon_caesar_relais_address),
                getString(R.string.pantheon_caesar_relais_phone), getString(R.string.pantheon_caesar_relais_website),
                getString(R.string.pantheon_caesar_relais_description), R.drawable.hotel_pantheon_caesar_relais_final));

        /**
         * create an {@Link WordItemAdapter} whose data source is a list of {@Link wordItems}
         * The adapter knows how to create the word items for each item in the list
         */
        WordItemAdapter adapter = new WordItemAdapter(getActivity(), wordItems);

        /**
         * find the {@Link ListView} object in the view hierarchy of the {@Link Activity}.
         * There should be an {@Link ListView} with the view id called word_list, which is
         * declared in the word_list.xml layout file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.word_list);

        /**
         * make the {@Link ListView} use the {@Link WordItemAdapter} we created above, so that
         * the {@Link ListView} will display list items for each {@Link WordItem} in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }
}