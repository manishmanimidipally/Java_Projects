package main;
import model.Book;
import service.LibraryService;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        LibraryService library = new LibraryService();

        int choice;

        do{
            System.out.println("\n==== Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter the Book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    Book book = new Book(id,title,author,price);
                    library.addBook(book);
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter the Book id : ");
                    int bookId = sc.nextInt();

                    Book foundBook = library.searchBook(bookId);
                    if(foundBook != null){
                        System.out.println(foundBook);
                    }
                    else{
                        System.out.println("The Book is Invalid ");
                    }
                    break;

                case 4:
                    System.out.println("Enter Book ID to issue ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;

                case 5:
                    System.out.println("Enter the Book Id to return : ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 6:
                    System.out.println("Enter the Id to Delete : ");
                    int deleteId = sc.nextInt();
                    library.deleteBook(deleteId);
                    break;
                case 7:
                    System.out.println("Than You for Using library Management System!");
                    break;
                default:
                    System.out.println("Invalid Choice! please try Again.");
            }
        }while(choice!=7);
        sc.close();
    }
    
}
