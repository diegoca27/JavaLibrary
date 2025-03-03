package LibraryJava;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public void addBook(String title, String author, int availableCopies){
        int isbn = books.size() + 1;
        Book b = new Book(title, author, isbn, availableCopies);
        books.add(b);
    }

    public void removeBooks(int isbn){
        books.remove(isbn);
    }

    public void displayBook(Book book){
        System.out.println("********* Book " + i + " *********");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Available copies: " + book.getAvailableCopies());
    }

    public void displayBooks(){
        for (int i= 0; i < books.size(); i++){
            displayBook(books.get(i));
        }
    }

    public void searchBook(String bookTitle){
        for (int i= 0; i < books.size(); i++){
            if (books.get(i).getTitle() == bookTitle){
                displayBook(books.get(i));
            }   
            else{
                System.out.println("Book not found");
            }
        }
    }

    public void registerPatron(String name, int id, String address, String additionalInfo) {
        Patron patron = new Patron(name, id, address, additionalInfo);
        patrons.add(patron);
    }

    public void displayPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons registered.");
        } else {
            for (Patron patron : patrons) {
                System.out.println(patron);
            }
        }
    }

    public Book findBookByISBN(int isbn) {
        for (Book book : books) {
            if (book.getISBN() == isbn) {
                return book;
            }
        }
        return null;
    }
    
    public Patron findPatronById(int id) {
        for (Patron patron : patrons) {
            if (patron.getId() == id) {
                return patron;
            }
        }
        return null;
    }

    public void borrowBook(int isbn, int patronId) {
        Book book = findBookByISBN(isbn);
        Patron patron = findPatronById(patronId);

        if (book != null && patron != null && book.getAvailableCopies() > 0) {
            book.setAvailableCopies(book.getAvailableCopies() - 1);
            patron.borrowBook(book);
            System.out.println(patron.getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Borrowing failed. Check book availability or patron ID.");
        }
    }

    public void returnBook(int isbn, int patronId) {
        Patron patron = findPatronById(patronId);

        if (patron != null && patron.returnBook(isbn)) {
            Book book = findBookByISBN(isbn);
            if (book != null) {
                book.setAvailableCopies(book.getAvailableCopies() + 1);
                System.out.println("Book returned: " + book.getTitle());
            }
        } else {
            System.out.println("Return failed. Check book ISBN or patron ID.");
        }
    }
}