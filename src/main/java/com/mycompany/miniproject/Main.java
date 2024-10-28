package com.mycompany.miniproject;

public class Main {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Library library = new Library();

        // Menambahkan buku ke perpustakaan
        Book book1 = new Book("Java Programming", "Author A", "A comprehensive guide", 150.0);
        Book book2 = new Book("Python Basics", "Author B", "Beginner's guide to Python", 120.0);
        Book book3 = new Book("Data Structures", "Author C", "Intermediate concepts", 200.0);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Menampilkan daftar buku di perpustakaan
        System.out.println("Daftar Buku di Perpustakaan:");
        System.out.printf("%-3s %-20s %-10s %-40s %-10s %-10s%n", "No", "Title", "Author", "Description", "Price", "Available");
        int index = 1;
        for (Book book : library.getBooks()) {
            System.out.printf("%-3d %-20s %-10s %-40s %-10.2f %-10s%n", index++, book.getTitle(), book.getAuthor(), book.getDescription(), book.getPrice(), book.isAvailable());
        }

        // Membuat anggota perpustakaan
        Student student = new Student("Alice", 101, "Jl. Merdeka", 123456);
        Lecture lecture = new Lecture("Mr. Smith", 102, "Jl. Sudirman", "TCH001"); // Mengubah nama ke Lecture

        // Meminjam buku dengan anggota Lecture
        // Student meminjam buku
        student.borrowBook(book1);

        // Menghitung denda jika buku terlambat dikembalikan oleh student
        int daysLate = 5;
        double fine = book1.calculateFine(daysLate);
        System.out.println("Denda untuk keterlambatan " + daysLate + " hari: " + fine);

        // Lecture meminjam buku
        lecture.borrowBook(book2);

        // Menghitung denda jika buku terlambat dikembalikan oleh lecture
        daysLate = 3;
        fine = book2.calculateFine(daysLate);
        System.out.println("Denda untuk keterlambatan " + daysLate + " hari: " + fine);

        // Menampilkan kembali status buku yang tersedia
        System.out.println("\nStatus buku setelah peminjaman:");
        System.out.printf("%-3s %-20s %-10s %-40s %-10s %-10s%n", "No", "Title", "Author", "Description", "Price", "Available");
        index = 1;
        for (Book book : library.getBooks()) {
            System.out.printf("%-3d %-20s %-10s %-40s %-10.2f %-10s%n", index++, book.getTitle(), book.getAuthor(), book.getDescription(), book.getPrice(), book.isAvailable());
        }
    }
}
