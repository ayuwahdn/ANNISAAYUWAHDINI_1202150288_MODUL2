package com.example.android.annisaayuwahdini_1202150288_modul2;

/**
 * Created by Annisa Ayu Wahdini on 2/18/2018.
 */

public class Model {
    private static int image;
    private int composition;
    private static String name;
    private static String price;
    public Model(int image, String name, String price, int composition) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.composition = composition;
    }

    public static String getPrice() {
        return price;
    }

    public static String getName() {

        return name;
    }

    public static int getImage() {
        return image;
    }
    public int getComposition() {
        return composition;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }


}