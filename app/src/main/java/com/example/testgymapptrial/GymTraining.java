package com.example.testgymapptrial;

public class GymTraining {
    private int id;
    private String name;
    private String shortDesc;
    private String longDesc;
    private String imageURL;

    public GymTraining(int id, String name, String shortDesc, String longDesc, String imageURL) {
        this.id = id;
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.imageURL = imageURL;
    }

    public GymTraining() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "GymTraining{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
