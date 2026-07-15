package model;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean isIssued;

    //constructor 
    public Book(int bookId,String title, String author, double price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isIssued = false;
    }

    //Getters 
    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public boolean isIssued(){
        return isIssued;
    }

    //setters 
    public void setBookId(int bookId){
        this.bookId = bookId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIssued(boolean issued){
        this.isIssued = issued;
    }


    //Display Book Details 
    public String toString(){
        return "Book ID : "+ bookId +
        "\nTitle : "+title +
        "\nAuthor : "+author +
        "\nPrice : "+price +
        "\nStatus : "+(isIssued ? "Issued" : "Available");
    }
}
