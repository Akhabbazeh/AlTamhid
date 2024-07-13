package com.beetronix.al_tamhid.features.about_book;

import java.util.ArrayList;
import java.util.List;

public class BeAboutBook {
    private int book_number;
    private ArrayList<Integer> img;
    private String name;
    private String link;
    private String link_app;
    private String discription;

    public BeAboutBook(int book_number, String name, ArrayList<Integer> img, String discription,String link, String link_app) {
        this.book_number = book_number;
        this.img = img;
        this.name = name;
        this.discription = discription;
        this.link = link;
        this.link_app = link_app;
    }

    public String getLink_app() {
        return link_app;
    }

    public void setLink_app(String link_app) {
        this.link_app = link_app;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getBook_number() {
        return book_number;
    }

    public void setBook_number(int book_number) {
        this.book_number = book_number;
    }

    public List<Integer> getImg() {
        return img;
    }

    public void setImg(ArrayList<Integer> img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
