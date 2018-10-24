package com.example.android.v3tourguideapp;

public class WordItem {

    /**
     * {@Link WordItem} represents the items that will be displayed.  It will cover the
     * categories of See, Eat, Sleep and Tours
     */

    /** the names of the items in the lists. This specifically is the name of the attraction,
     * restaurant, hotel or tour.
     */
    private String mItemName;

    /** the names of the items in the lists.  This specifically will display the address for the See,
     * Eat and Sleep fragments. It will display the Duration for the Tour fragment.
     */
    private String mDetailItemOne;

    /** the names of the items in the lists. This specifically will display phone number for the See,
     * Eat and Sleep fragments. It will display the Cost for the Tour fragment.
     */
    private String mDetailItemTwo;

    /** the names of the items in the lists. This specifically will display the hours for the See and
     * Eat fragments. It will display the website for the Sleep and Tours fragments.
     */
    private String mDetailItemThree;

    /** the names of the items in the lists.  This specifically will display the general information
     * about the attraction, restaurant, hotel or tour.
     */
    private String mItemDescription;

    /** image resource ID for the items in the lists.  This specifically will show the image associated
     * with the attraction, restaurant, hotel or tour.
     */
    private int mImageResourceId;

    /**
     * Create a new WordItem object that takes in 6 arguements (5 strings and 1 image)
     * @param itemName is the name of the item in the list. IE attraction, restaurant, hotel or tour.
     * @param itemOne is the address in the See, Eat and Sleep fragments. In the Tours fragment it is the tour duration.
     * @param itemTwo is the phone number in the See, Eat and Sleep fragments. In the Tours fragment it is the tour cost.
     * @param itemThree is the hours of location in the See and Eat fragments. In the Sleep and Tours fragments it is the website.
     * @param itemDescription description of the attraction, restaurant, hotel or tour.
     * @param imageResourceId is the resource ID for the image associated with the word item in the list
     */
    public WordItem(String itemName, String itemOne, String itemTwo, String itemThree, String itemDescription, int imageResourceId) {
        mItemName = itemName;
        mDetailItemOne = itemOne;
        mDetailItemTwo = itemTwo;
        mDetailItemThree = itemThree;
        mItemDescription = itemDescription;
        mImageResourceId = imageResourceId;
    }

    /** the names of the items in the lists. This specifically is the name of the attraction,
     * restaurant, hotel or tour.
     */
    public String getItemName(){
        return mItemName;
    }

    /** the names of the items in the lists.  This specifically will display the address for the See,
     * Eat and Sleep fragments. It will display the Duration for the Tour fragment.
     */
    public String getItemOne(){
        return mDetailItemOne;
    }

    /** the names of the items in the lists. This specifically will display phone number for the See,
     * Eat and Sleep fragments. It will display the Cost for the Tour fragment.
     */
    public String getItemTwo(){
        return mDetailItemTwo;
    }

    /** the names of the items in the lists. This specifically will display the hours for the See and
     * Eat fragments. It will display the website for the Sleep and Tours fragments.
     */
    public String getItemThree(){
        return mDetailItemThree;
    }

    /** the names of the items in the lists.  This specifically will display the general information
     * about the attraction, restaurant, hotel or tour.
     */
    public String getItemDescription(){
        return mItemDescription;
    }

    /** image resource ID for the items in the lists.  This specifically will show the image associated
     * with the attraction, restaurant, hotel or tour.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}