package com.example.android.v3tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * displays a {@Link ViewPager} where each page shows a different category in the app.
     * The four categories are See, Eat, Sleep and Tours
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** find the ViewPager that will allow the user to swipe between fragments */
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        /** create an adapter which knows which fragment to display on the page */
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        /** set the Adapter on the ViewPager */
        viewPager.setAdapter(adapter);

        /** find the tab layout that shows the tabs */
        TabLayout tabLayout = (TabLayout) findViewById(R.id.navigation_tabs);

        /**
         * connect the TabLayout with the ViewPager. This will:
         * 1.  update the TabLayout when the ViewPager is swiped
         * 2.  update the ViewPager when the tab is selected
         * 3.  set the tab layouts tab names with the ViewPagers Adapters titles by calling onPageTitle()
         */
        tabLayout.setupWithViewPager(viewPager);
    }
}