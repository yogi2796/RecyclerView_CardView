package com.example.recyclerview_cardview;

public class Product {

    private int id;
    private String itemname1;
    private String shortdesc1;
    private double rating1;
    private double price1;
    private int imageview1;

    public Product(int id, String itemname1, String shortdesc1, double rating1, double price1, int imageview1) {
        this.id = id;
        this.itemname1 = itemname1;
        this.shortdesc1 = shortdesc1;
        this.rating1 = rating1;
        this.price1 = price1;
        this.imageview1 = imageview1;
    }


    public int getId() {
        return id;
    }

    public String getItemname1() {
        return itemname1;
    }

    public String getShortdesc1() {
        return shortdesc1;
    }

    public double getRating1() {
        return rating1;
    }

    public double getPrice1() {
        return price1;
    }

    public int getImageview1() {
        return imageview1;
    }
}
