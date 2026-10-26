
import java.util.Scanner;

public class ImplementASimpleInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();

        Report r = new Report(title);
        Printable p;
        p = r;
        p.print();

        scanner.close();
    }
}

interface Printable {

    void print();
}

class Report implements Printable {

    String title;

    Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + title);
    }
}
