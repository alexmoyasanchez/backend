package edu.upc.dsa.models;

public class Insignias {

    String name;
    String URL_Image;

    public Insignias(String name, String URL_Image) {
        this.name = name;
        this.URL_Image = URL_Image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL_Image() {
        return URL_Image;
    }

    public void setURL_Image(String URL_Image) {
        this.URL_Image = URL_Image;
    }
}
