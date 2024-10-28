package com.mycompany.miniproject;

public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String alamat; // Menambahkan variabel alamat

    // Constructor
    public LibraryMember(String name, int memberId, String alamat) {
        this.name = name;
        this.memberId = memberId;
        this.alamat = alamat; // Inisialisasi alamat
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getAlamat() {
        return alamat; // Getter untuk alamat
    }

    // Abstraksi metode umum
    public abstract void borrowBook(Book book);
}
