package main;

import java.io.Serializable;

public abstract class Animal implements Serializable {

    private int id;
    private String picture;
    private String name;
    private String status;
    private String description;

    public Animal(int id, String picture, String name, String status, String description) {
        this.id = id;
        this.picture = picture;
        this.name = name;
        this.status = status;
        this.description = description;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
