package com.mycompany.miniproject;

public class Lecture extends LibraryMember {
    private String lectureId;

    public Lecture(String name, int id, String address, String lectureId) {
        super(name, id, address); // Memanggil konstruktor dari LibraryMember
        this.lectureId = lectureId;
    }

    // Implementasi metode pinjam buku
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " meminjam buku: " + book.getTitle());
        } else {
            System.out.println("Buku tidak tersedia untuk dipinjam.");
        }
    }
}
