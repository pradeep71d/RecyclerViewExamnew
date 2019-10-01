package com.example.recycling;

public class Company {
    private String name;
    private String domain;
    private int image;

    public Company(String name, String domain, int image) {
        this.name = name;
        this.domain = domain;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
