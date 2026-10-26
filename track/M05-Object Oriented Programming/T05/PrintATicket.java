
import java.util.Scanner;

public class PrintATicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        Ticket t = new Ticket(code);
        t.print();
    }
}

interface Printable {

    void print();
}

class Ticket implements Printable {

    String code;

    Ticket(String code) {
        this.code = code;
    }

    public void print() {
        System.out.println("Ticket: " + code);
    }
}
