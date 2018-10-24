package com.example.android.v3tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/** A simple {@link Fragment} subclass. */
public class ToursFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** Create a list of items */
        final ArrayList<WordItem> wordItems = new ArrayList<WordItem>();
        wordItems.add(new WordItem(getString(R.string.walk_on_walk_off_rome_name), getString(R.string.walk_on_walk_off_rome_duration),
                getString(R.string.walk_on_walk_off_rome_cost), getString(R.string.walk_on_walk_off_rome_booking),
                getString(R.string.walk_on_walk_off_rome_description), R.drawable.tour_walk_on_walk_off_final));
        wordItems.add(new WordItem(getString(R.string.top_tier_colosseum_name), getString(R.string.top_tier_colosseum_duration),
                getString(R.string.top_tier_colosseum_cost), getString(R.string.top_tier_colosseum_booking),
                getString(R.string.top_tier_colosseum_description), R.drawable.tour_top_tier_colosseum_forum_final));
        wordItems.add(new WordItem(getString(R.string.rome_in_a_day_name), getString(R.string.rome_in_a_day_duration),
                getString(R.string.rome_in_a_day_cost), getString(R.string.rome_in_a_day_booking),
                getString(R.string.rome_in_a_day_description), R.drawable.tour_rome_in_a_day_final));
        wordItems.add(new WordItem(getString(R.string.pompeii_amalfi_coast_name), getString(R.string.pompeii_amalfi_coast_duration),
                getString(R.string.pompeii_amalfi_coast_cost), getString(R.string.pompeii_amalfi_coast_booking),
                getString(R.string.pompeii_amalfi_coast_description), R.drawable.tour_pompeii_amalfi_coast_final));
        wordItems.add(new WordItem(getString(R.string.crypts_catacombs_name), getString(R.string.crypts_catacombs_duration),
                getString(R.string.crypts_catacombs_cost), getString(R.string.crypts_catacombs_booking),
                getString(R.string.crypts_catacombs_description), R.drawable.tour_crypt_catacomb_final));
        wordItems.add(new WordItem(getString(R.string.ghost_mystery_walk_name), getString(R.string.ghost_mystery_walk_duration),
                getString(R.string.ghost_mystery_walk_cost), getString(R.string.ghost_mystery_walk_booking),
                getString(R.string.ghost_mystery_walk_description), R.drawable.tour_ghost_mystery_walking_final));
        wordItems.add(new WordItem(getString(R.string.vip_colosseum_forum_name), getString(R.string.vip_colosseum_forum_duration),
                getString(R.string.vip_colosseum_forum_cost), getString(R.string.vip_colosseum_forum_booking),
                getString(R.string.vip_colosseum_forum_description), R.drawable.tour_vip_colosseum_underground_forum_final));
        wordItems.add(new WordItem(getString(R.string.skip_line_vatican_name), getString(R.string.skip_line_vatican_duration),
                getString(R.string.skip_line_vatican_cost), getString(R.string.skip_line_vatican_booking),
                getString(R.string.skip_line_vatican_description), R.drawable.tour_skip_the_line_vatican_sistine_final));
        wordItems.add(new WordItem(getString(R.string.colosseum_ancient_rome_by_night_name), getString(R.string.colosseum_ancient_rome_by_night_duration),
                getString(R.string.colosseum_ancient_rome_by_night_cost), getString(R.string.colosseum_ancient_rome_by_night_booking),
                getString(R.string.colosseum_ancient_rome_by_night_description), R.drawable.tour_colosseum_by_night_final));
        wordItems.add(new WordItem(getString(R.string.gladiator_school_name), getString(R.string.gladiator_school_duration),
                getString(R.string.gladiator_school_cost), getString(R.string.gladiator_school_booking),
                getString(R.string.gladiator_school_description), R.drawable.tour_gladiator_school_final));

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