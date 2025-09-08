package com.example.tpo2.Model;

import java.io.Serializable;

public class Libro implements Serializable {
    private String title;
    private String author;

    private int year;
    private int pages;
    private String description;

    public Libro(String title, String author, int year, int pages, String description) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
