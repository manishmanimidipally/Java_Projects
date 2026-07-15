package service;
import java.util.ArrayList;

import model.Book;


public class LibraryService {

    private ArrayList<Book> bookList = new ArrayList<>();
    
    //Add Book
    public void addBook(Book book){
        bookList.add(book);
        System.out.println("Book Added Succesfully ");
    }

    //View All Books
    public void viewBooks(){
        if(bookList.isEmpty()){
            System.out.println("No books Availabel ");
            return ;
        }

        for(Book book : bookList){
            System.out.println("--------------------------");
            System.out.println(book);
        }
    }

    //Search Book by id
    public Book searchBook(int bookId){
        for(Book book : bookList){
            if(book.getBookId() == bookId){
                return book;
            }
        }
        return null;
    }

    //Issue Book
    public void issueBook(int bookId){
        Book book = searchBook(bookId);

        if(book == null){
            System.out.println("Book Not Found");
        }
        else if(book.isIssued()){
            System.out.println("Book Already Issued! ");
        }
        else{
            book.setIssued(true);
            System.out.println("Book Issued Succesfully ");
        }
    }

    //Return Book
    public void returnBook(int bookId){
        Book book = searchBook(bookId);

        if(book == null){
            System.out.println("The Book is Invalid ");
        }
        else if(!book.isIssued()){
            System.out.println("Book is Already Available!");
        }
        else{
            book.setIssued(false);
            System.out.println("Book Returned Successfully!");

        }
    }


    //Delete Book
    public void deleteBook(int bookId){
        Book book = searchBook(bookId);
        
        if(book == null){
            System.out.println("Book Not Found");
        }
        else{
            bookList.remove(book);
            System.out.println("Book Deleted Successfully ");
        }
    }
}
