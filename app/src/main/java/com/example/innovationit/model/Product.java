package com.example.innovationit.model;

public class Product {

    private String nameID,detailsID;
    private int imageID;

    public Product(String nameID,String detailsID, int imageID) {
        this.nameID = nameID;
        this.imageID = imageID;
        this.detailsID = detailsID;
    }

    public String getNameID() {
        return nameID;
    }

    public void setNameID(String nameID) {
        this.nameID = nameID;
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
