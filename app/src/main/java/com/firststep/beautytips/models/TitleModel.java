package com.firststep.beautytips.models;

/**
 * Created by DELL on 7/1/2017.
 */

public class TitleModel {
    private String image;
    private  String title;

    public TitleModel(String image, String title) {
        this.image = image;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
