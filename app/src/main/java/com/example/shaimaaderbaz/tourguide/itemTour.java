package com.example.shaimaaderbaz.tourguide;

/**
 * Created by Shaimaa Derbaz on 1/3/2018.
 */

public class itemTour {
    String itemName;
    String itemAbout;
    int imageId;

    public itemTour()
    {

    }
    public itemTour(String itemName, String itemAbout, int imageId) {
        this.itemName = itemName;
        this.itemAbout = itemAbout;
        this.imageId = imageId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemAbout() {
        return itemAbout;
    }

    public void setItemAbout(String itemAbout) {
        this.itemAbout = itemAbout;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
