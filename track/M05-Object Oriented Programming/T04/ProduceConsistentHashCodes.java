
import java.util.Scanner;

public class ProduceConsistentHashCodes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        Book b1 = new Book(id);
        Book b2 = new Book(id);

        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());

        scanner.close();
    }
}

class Book {

    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    public boolean equals(Object obj) {
        Book b = (Book) obj;
        if (this.bookId == b.bookId) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return bookId;
    }
}
