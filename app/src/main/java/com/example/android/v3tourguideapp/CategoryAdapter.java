package com.example.android.v3tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * {@Link CategoryAdapter} is a {@Link FragmentPagerAdapter} that can provide the layout
     * for each list item based on a data source which is a list of {@Link WordItem} objects.
     */

    /** context of the app */
    private Context mContext;

    /**
     * create a new {@Link CategoryAdapter} object.
     * @param Context is the context of the app.
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * return the {@Link Fragment} that should be displayed for the given page number
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SeeFragment();
        } else if (position == 1){
            return new EatFragment();
        } else if (position == 2){
            return new SleepFragment();
        } else {
            return new ToursFragment();
        }
    }

    /** return the total number of pages */
    @Override
    public int getCount() {
        return 4;
    }

    /** generate titles based on item positions */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.see_fragment);
        } else if (position == 1){
            return mContext.getString(R.string.eat_fragment);
        } else if (position == 2){
            return mContext.getString(R.string.sleep_fragment);
        } else {
            return mContext.getString(R.string.tour_fragment);
        }
    }
}