package lab2;
import java.util.Scanner;
class Book {
    
    private int bookId;
    private String title;
    private String author;
    private double price;

    private static int totalBooks = 0;

  
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++; 
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.printf("Price   : ₹%.2f%n", price);
        System.out.println("----------------------------------");
    }

  
    public static Book search(Book[] books, int searchId) {
        for (Book b : books) {
            if (b != null && b.bookId == searchId) {
                return b;
            }
        }
        return null;
    }

   
    public static Book search(Book[] books, String searchTitle) {
        for (Book b : books) {
            if (b != null && b.title.equalsIgnoreCase(searchTitle)) {
                return b;
            }
        }
        return null;
    }

    
    public Book getCostlierBook(Book other) {
        if (other == null || this.price >= other.price) {
            return this;
        }
        return other;
    }

    
    public static int getTotalBooks() {
        return totalBooks;
    }
}

public class lab2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book b1 = new Book(101, "java", "Robert ", 650.00);
        Book b2 = new Book(102, "python", "Joshua", 820.50);
        Book b3 = new Book(103, "c++ easy", "Eric", 740.00);

      
        Book[] library = {b1, b2, b3};

      
        System.out.println("=== All Books ===");
        for (Book b : library) {
            b.display();
        }

        System.out.println("Total Books Created: " + Book.getTotalBooks());
        System.out.println();

        System.out.println("enter book id to find\n");
        int idToFind = sc.nextInt();
        sc.nextLine();
        System.out.println("=== Searching for Book ID: " + idToFind + " ===");
        Book foundById = Book.search(library, idToFind);
        if (foundById != null) {
            foundById.display();
        } else {
            System.out.println("Book with ID " + idToFind + " not found.\n");
        }

        System.out.println("enter book title to find\n");
        String titleToFind =sc.nextLine();
        System.out.println("=== Searching for Title: \"" + titleToFind + "\" ===");
        Book foundByTitle = Book.search(library, titleToFind);
        if (foundByTitle != null) {
            foundByTitle.display();
        } else {
            System.out.println("Book titled \"" + titleToFind + "\" not found.\n");
        }

        System.out.println("=== Comparing Prices (Book 1 vs Book 2) ===");
        Book costlier = b1.getCostlierBook(b2);
        System.out.println("The costlier book is:");
        costlier.display();
    }
}
