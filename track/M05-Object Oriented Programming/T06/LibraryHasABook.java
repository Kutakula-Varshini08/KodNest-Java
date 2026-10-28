
import java.util.Scanner;

public class LibraryHasABook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String libraryName = scanner.nextLine();
        String bookTitle = scanner.nextLine();
        Book b = new Book(bookTitle);
        Library l = new Library(libraryName, b);
        l.showDetails();
        scanner.close();
    }
}

class Book {

    private String bookTitle;

    Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getName() {
        return bookTitle;
    }
}

class Library {

    private String libraryName;
    private Book book;

    Library(String libraryName, Book book) {
        this.libraryName = libraryName;
        this.book = book;
    }

    void showDetails() {
        System.out.println(libraryName + " has " + book.getName());
    }
}
