package LibraryJava;

public class Book{
    //Atributos
    private String title;
    private String author;
    private int isbn;
    private int availableCopies;
    
    //Constructor
    public Book(String title, String author, int isbn, int availableCopies){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getISBN(){
        return isbn;
    }

    public int getAvailableCopies(){
        return availableCopies;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setISBN(int isbn){
        this.isbn = isbn;
    }
    public void setAvailableCopies(int availableCopies){
        this.availableCopies = availableCopies;
    }

}