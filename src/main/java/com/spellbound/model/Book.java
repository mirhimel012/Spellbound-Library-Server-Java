package com.spellbound.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {

    @Id
    private String id;

    private String name;
    private String author;
    private String category;
    private double rating;
    private String photo;
    private int quantity;
    private String message;

    public Book() {}

    public Book(String name, String author, String category, double rating, String photo, int quantity, String message) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.rating = rating;
        this.photo = photo;
        this.quantity = quantity;
        this.message = message;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
