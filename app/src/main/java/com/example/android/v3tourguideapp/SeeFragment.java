package com.example.android.v3tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/** A simple {@link Fragment} subclass. */
public class SeeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** Create a list of items */
        final ArrayList<WordItem> wordItems = new ArrayList<WordItem>();
        wordItems.add(new WordItem(getString(R.string.colosseum_name), getString(R.string.colosseum_address),
                getString(R.string.colosseum_phone), getString(R.string.colosseum_hours),
                getString(R.string.colosseum_description), R.drawable.see_colosseum_final));
        wordItems.add(new WordItem(getString(R.string.roman_forum_name), getString(R.string.roman_forum_address),
                getString(R.string.roman_forum_phone), getString(R.string.roman_forum_hours),
                getString(R.string.roman_forum_description), R.drawable.see_roman_forum_final));
        wordItems.add(new WordItem(getString(R.string.arch_constantine_name), getString(R.string.arch_constantine_address),
                getString(R.string.arch_constantine_phone), getString(R.string.arch_constantine_hours),
                getString(R.string.arch_constantine_description), R.drawable.see_arch_of_constantine_final));
        wordItems.add(new WordItem(getString(R.string.arch_titus_name), getString(R.string.arch_titus_address),
                getString(R.string.arch_titus_phone), getString(R.string.arch_titus_hours),
                getString(R.string.arch_titus_description), R.drawable.see_arch_of_titus_final));
        wordItems.add(new WordItem(getString(R.string.palatine_hill_name), getString(R.string.palatine_hill_address),
                getString(R.string.palatine_hill_phone), getString(R.string.palatine_hill_hours),
                getString(R.string.palatine_hill_description), R.drawable.see_palatine_hill_final));
        wordItems.add(new WordItem(getString(R.string.circus_maximus_name), getString(R.string.circus_maximus_address),
                getString(R.string.circus_maximus_phone), getString(R.string.circus_maximus_hours),
                getString(R.string.circus_maximus_description), R.drawable.see_circus_maximus_final));
        wordItems.add(new WordItem(getString(R.string.capitoline_museums_name), getString(R.string.capitoline_museums_address),
                getString(R.string.capitoline_museums_phone), getString(R.string.capitoline_museums_hours),
                getString(R.string.capitoline_museums_description), R.drawable.see_capitoline_museum_final));
        wordItems.add(new WordItem(getString(R.string.capitoline_hill_name), getString(R.string.capitoline_hill_address),
                getString(R.string.capitoline_hill_phone), getString(R.string.capitoline_hill_hours),
                getString(R.string.capitoline_hill_description), R.drawable.see_capitoline_hill_final));
        wordItems.add(new WordItem(getString(R.string.altare_della_patria_name), getString(R.string.altare_della_patria_address),
                getString(R.string.altare_della_patria_phone), getString(R.string.altare_della_patria_hours),
                getString(R.string.altare_della_patria_description), R.drawable.see_altare_della_patria_final));
        wordItems.add(new WordItem(getString(R.string.trajans_column_name), getString(R.string.trajans_column_address),
                getString(R.string.trajans_column_phone), getString(R.string.trajans_column_hours),
                getString(R.string.trajans_column_description), R.drawable.see_trajans_column_final));
        wordItems.add(new WordItem(getString(R.string.trajans_market_name), getString(R.string.trajans_market_address),
                getString(R.string.trajans_market_phone), getString(R.string.trajans_market_hours),
                getString(R.string.trajans_market_description), R.drawable.see_trajans_market_final));
        wordItems.add(new WordItem(getString(R.string.basilica_maggiore_name), getString(R.string.basilica_maggiore_address),
                getString(R.string.basilica_maggiore_phone), getString(R.string.basilica_maggiore_hours),
                getString(R.string.basilica_maggiore_description), R.drawable.see_basilica_di_santa_maria_maggiore_final));
        wordItems.add(new WordItem(getString(R.string.trevi_fountain_name), getString(R.string.trevi_fountain_address),
                getString(R.string.trevi_fountain_phone), getString(R.string.trevi_fountain_hours),
                getString(R.string.trevi_fountain_description), R.drawable.see_trevi_fountain_final));
        wordItems.add(new WordItem(getString(R.string.pantheon_name), getString(R.string.pantheon_address),
                getString(R.string.pantheon_phone), getString(R.string.pantheon_hours),
                getString(R.string.pantheon_description), R.drawable.see_pantheon_final));
        wordItems.add(new WordItem(getString(R.string.fontana_quattro_fiumi_name), getString(R.string.fontana_quattro_fiumi_address),
                getString(R.string.fontana_quattro_fiumi_phone), getString(R.string.fontana_quattro_fiumi_hours),
                getString(R.string.fontana_quattro_fiumi_description), R.drawable.see_fontana_dei_quattro_fiume_final));
        wordItems.add(new WordItem(getString(R.string.piazza_navona_name), getString(R.string.piazza_navona_address),
                getString(R.string.piazza_navona_phone), getString(R.string.piazza_navona_hours),
                getString(R.string.piazza_navona_description), R.drawable.see_piazza_navona_final));
        wordItems.add(new WordItem(getString(R.string.castel_sant_angelo_name), getString(R.string.castel_sant_angelo_address),
                getString(R.string.castel_sant_angelo_phone), getString(R.string.castel_sant_angelo_hours),
                getString(R.string.castel_sant_angelo_description), R.drawable.see_castel_sant_angelo_final));
        wordItems.add(new WordItem(getString(R.string.st_peter_square_name), getString(R.string.st_peter_square_address),
                getString(R.string.st_peter_square_phone), getString(R.string.st_peter_square_hours),
                getString(R.string.st_peter_square_description), R.drawable.see_st_peter_square_final));
        wordItems.add(new WordItem(getString(R.string.st_peter_basilica_name), getString(R.string.st_peter_basilica_address),
                getString(R.string.st_peter_basilica_phone), getString(R.string.st_peter_basilica_hours),
                getString(R.string.st_peter_basilica_description), R.drawable.see_st_peter_basilica_final));
        wordItems.add(new WordItem(getString(R.string.sistine_chapel_name), getString(R.string.sistine_chapel_address),
                getString(R.string.sistine_chapel_phone), getString(R.string.sistine_chapel_hours),
                getString(R.string.sistine_chapel_description), R.drawable.see_sistine_chapel_final));
        wordItems.add(new WordItem(getString(R.string.vatican_museums_name), getString(R.string.vatican_museums_address),
                getString(R.string.vatican_museums_phone), getString(R.string.vatican_museums_hours),
                getString(R.string.vatican_museums_description), R.drawable.see_vatican_museum_final));
        wordItems.add(new WordItem(getString(R.string.spanish_steps_name), getString(R.string.spanish_steps_address),
                getString(R.string.spanish_steps_phone), getString(R.string.spanish_steps_hours),
                getString(R.string.spanish_steps_description), R.drawable.see_spanish_steps_final));
        wordItems.add(new WordItem(getString(R.string.galleria_borghese_name), getString(R.string.galleria_borghese_address),
                getString(R.string.galleria_borghese_phone), getString(R.string.galleria_borghese_hours),
                getString(R.string.galleria_borghese_description), R.drawable.see_galleria_borghese_final));
        wordItems.add(new WordItem(getString(R.string.piazza_del_popolo_name), getString(R.string.piazza_del_popolo_address),
                getString(R.string.piazza_del_popolo_phone), getString(R.string.piazza_del_popolo_hours),
                getString(R.string.piazza_del_popolo_description), R.drawable.see_piazza_del_popolo_final));

        /**
         * create an {@Link WordItemAdapter} whose data source is a list of {@Link wordItems}
         * The adapter knows how to create the word items for each item in the list
         */
        final WordItemAdapter adapter = new WordItemAdapter(getActivity(), wordItems);

        /**
         * find the {@Link ListView} object in the view hierarchy of the {@Link Activity}.
         * There should be an {@Link ListView} with the view id called word_list, which is
         * declared in the word_list.xml layout file.
         */
        final ListView listView = (ListView) rootView.findViewById(R.id.word_list);

        /**
         * make the {@Link ListView} use the {@Link WordItemAdapter} we created above, so that
         * the {@Link ListView} will display list items for each {@Link WordItem} in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }
}