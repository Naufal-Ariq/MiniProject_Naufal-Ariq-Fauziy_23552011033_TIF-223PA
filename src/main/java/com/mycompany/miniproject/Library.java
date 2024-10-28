package com.mycompany.miniproject;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku " + book.getTitle() + " berhasil ditambahkan ke perpustakaan.");
    }

    public List<Book> getBooks() {
        return books; // Mengembalikan daftar buku
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
