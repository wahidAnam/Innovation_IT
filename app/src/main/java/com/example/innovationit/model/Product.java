package com.example.innovationit.model;

public class Product {

    private String detailsID;
    private int imageID;

    public Product(String detailsID, int imageID) {
        this.imageID = imageID;
        this.detailsID = detailsID;
    }
    public String getDetailsID() {
        return detailsID;
    }

    public void setDetailsID(String detailsID) {
        this.detailsID = detailsID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
