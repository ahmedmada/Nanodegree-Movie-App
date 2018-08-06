package com.e.k.m.a.elmomovieapp.models;

import java.io.Serializable;

/**
 * Created by ahmedelmoselhy on 4/14/2018.
 */

public class TrailerModel implements Serializable {
    private String name,key;

    public TrailerModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
