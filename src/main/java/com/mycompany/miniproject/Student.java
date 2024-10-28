package com.mycompany.miniproject;

public class Student extends LibraryMember {
    private int nim; // Menambahkan variabel NIM

    // Constructor
    public Student(String name, int memberId, String address, int nim) {
        super(name, memberId, address);
        this.nim = nim; // Inisialisasi NIM
    }

    // Getter untuk NIM
    public int getNim() {
        return nim;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Student) with NIM " + getNim() + " has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
}


