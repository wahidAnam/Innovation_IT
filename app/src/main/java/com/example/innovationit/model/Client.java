package com.example.innovationit.model;

public class Client {

    private String nameTV;
    private int imageFTB;

    public Client(String nameTV, int imageFTB) {
        this.nameTV = nameTV;
        this.imageFTB = imageFTB;
    }

    public String getNameTV() {
        return nameTV;
    }

    public void setNameTV(String nameTV) {
        this.nameTV = nameTV;
    }

    public int getImageFTB() {
        return imageFTB;
    }

    public void setImageFTB(int imageFTB) {
        this.imageFTB = imageFTB;
    }
}
