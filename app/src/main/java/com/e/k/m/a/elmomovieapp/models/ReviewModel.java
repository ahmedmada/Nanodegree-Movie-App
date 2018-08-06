package com.e.k.m.a.elmomovieapp.models;

import java.io.Serializable;

/**
 * Created by ahmedelmoselhy on 4/14/2018.
 */

public class ReviewModel implements Serializable {

    private String author,content;

    public ReviewModel() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
