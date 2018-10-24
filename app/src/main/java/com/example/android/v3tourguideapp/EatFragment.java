package com.example.android.v3tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/** A simple {@link Fragment} subclass. */
public class EatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** Create a list of items */
        final ArrayList<WordItem> wordItems = new ArrayList<WordItem>();
        wordItems.add(new WordItem(getString(R.string.ristorante_pepe_rosa_name), getString(R.string.ristorante_pepe_rosa_address),
                getString(R.string.ristorante_pepe_rosa_phone), getString(R.string.ristorante_pepe_rosa_hours),
                getString(R.string.ristorante_pepe_rosa_description), R.drawable.rest_pepe_rosa_final));
        wordItems.add(new WordItem(getString(R.string.il_tamburello_pulcinella_name), getString(R.string.il_tamburello_pulcinella_address),
                getString(R.string.il_tamburello_pulcinella_phone), getString(R.string.il_tamburello_pulcinella_hours),
                getString(R.string.il_tamburello_pulcinella_description), R.drawable.rest_tamburello_pulcinella_final));
        wordItems.add(new WordItem(getString(R.string.tonnarello_name), getString(R.string.tonnarello_address),
                getString(R.string.tonnarello_phone), getString(R.string.tonnarello_hours),
                getString(R.string.tonnarello_description), R.drawable.rest_tonnarello_final));
        wordItems.add(new WordItem(getString(R.string.burger_bistrot_name), getString(R.string.burger_bistrot_address),
                getString(R.string.burger_bistrot_phone), getString(R.string.burger_bistrot_hours),
                getString(R.string.burger_bistrot_description), R.drawable.rest_burger_bistrot_final));
        wordItems.add(new WordItem(getString(R.string.mimi_e_coco_name), getString(R.string.mimi_e_coco_address),
                getString(R.string.mimi_e_coco_phone), getString(R.string.mimi_e_coco_hours),
                getString(R.string.mimi_e_coco_description), R.drawable.rest_mimi_coco_final));
        wordItems.add(new WordItem(getString(R.string.cantina_e_cucina_name), getString(R.string.cantina_e_cucina_address),
                getString(R.string.cantina_e_cucina_phone), getString(R.string.cantina_e_cucina_hours),
                getString(R.string.cantina_e_cucina_description), R.drawable.rest_cantina_cucina_final));
        wordItems.add(new WordItem(getString(R.string.arrosticino_pane_vino_name), getString(R.string.arrosticino_pane_vino_address),
                getString(R.string.arrosticino_pane_vino_phone), getString(R.string.arrosticino_pane_vino_hours),
                getString(R.string.arrosticino_pane_vino_description), R.drawable.rest_arrosticino_pane_vino_final));
        wordItems.add(new WordItem(getString(R.string.alchimia_foodlab_name), getString(R.string.alchimia_foodlab_address),
                getString(R.string.alchimia_foodlab_phone), getString(R.string.alchimia_foodlab_hours),
                getString(R.string.alchimia_foodlab_description), R.drawable.rest_alchima_foodlab_final));
        wordItems.add(new WordItem(getString(R.string.osti_matti_name), getString(R.string.osti_matti_address),
                getString(R.string.osti_matti_phone), getString(R.string.osti_matti_hours),
                getString(R.string.osti_matti_description), R.drawable.rest_osti_matti_final));
        wordItems.add(new WordItem(getString(R.string.the_loft_name), getString(R.string.the_loft_address),
                getString(R.string.the_loft_phone), getString(R.string.the_loft_hours),
                getString(R.string.the_loft_description), R.drawable.rest_the_loft_final));
        wordItems.add(new WordItem(getString(R.string.otello_name), getString(R.string.otello_address),
                getString(R.string.otello_phone), getString(R.string.otello_hours),
                getString(R.string.otello_description), R.drawable.rest_otello_final));
        wordItems.add(new WordItem(getString(R.string.armando_al_pantheon_name), getString(R.string.armando_al_pantheon_address),
                getString(R.string.armando_al_pantheon_phone), getString(R.string.armando_al_pantheon_hours),
                getString(R.string.armando_al_pantheon_description), R.drawable.rest_armando_al_pantheon_final));

        /**
         * create an {@Link WordItemAdapter} whose data source is a list of {@Link wordItems}
         * The adapter knows how to create the word items for each item in the list
         */
        WordItemAdapter adapter = new WordItemAdapter(getActivity(), wordItems);

        /**
         * find the {@Link ListView} object in the view hierarchy of the {@Link Activity}.
         * There should be a {@Link ListView} with the view id called word_list, which is
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