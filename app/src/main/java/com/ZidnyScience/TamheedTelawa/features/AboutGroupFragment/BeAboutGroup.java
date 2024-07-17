package com.ZidnyScience.TamheedTelawa.features.AboutGroupFragment;

public class BeAboutGroup {
    private int book_number;
    private int img;
    private String name;
    private String link;
    public BeAboutGroup(int book_number, int img, String name,String link) {
        this.img = img;
        this.name = name;
        this.link = link;
        this.book_number = book_number;
    }


    public int getBook_number() {
        return book_number;
    }

    public void setBook_number(int book_number) {
        this.book_number = book_number;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
