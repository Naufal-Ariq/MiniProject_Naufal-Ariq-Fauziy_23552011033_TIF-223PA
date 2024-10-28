package com.mycompany.miniproject;

public class Book {
    private String title;
    private String author;
    private String description; // Menambahkan variabel deskripsi
    private double price;       // Menambahkan variabel harga
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String description, double price) {
        this.title = title;
        this.author = author;
        this.description = description; // Inisialisasi deskripsi
        this.price = price;             // Inisialisasi harga
        this.isAvailable = true;        // Default: Buku tersedia saat dibuat
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Method untuk menghitung denda
    public double calculateFine(int daysLate) {
        double finePerDay = 1.0; // Denda per hari
        return daysLate * finePerDay;
    }
}
