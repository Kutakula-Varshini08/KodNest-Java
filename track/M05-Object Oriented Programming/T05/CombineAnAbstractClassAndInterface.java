
import java.util.Scanner;

public class CombineAnAbstractClassAndInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();

        Report r = new Report(title);
        r.showType();
        r.print();
    }
}

abstract class Document {

    String title;

    Document(String title) {
        this.title = title;
    }

    abstract void showType();
}

interface Printable {

    void print();
}

class Report extends Document implements Printable {

    Report(String title) {
        super(title);
    }

    public void showType() {
        System.out.println("Report: " + title);
    }

    public void print() {
        System.out.println("Printed: " + title);
    }
}
