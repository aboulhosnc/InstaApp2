package com.example.chady.instaapp2;

/**
 * Created by Chady on 3/28/2018.
 */

public class Insta {

    private String title,desc,image;

    public Insta(){

    }
    public Insta(String tile, String desc, String image){
        this.title = title;
        this.image = image;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage() {
        return image;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
