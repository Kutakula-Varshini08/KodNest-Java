
import java.util.Scanner;

public class ImplementTwoNotebookCapabilities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Notebook n = new Notebook(name);
        n.read();
        n.write();
    }
}

interface Readable {

    void read();
}

interface Writable {

    void write();
}

class Notebook implements Readable, Writable {

    String name;

    Notebook(String name) {
        this.name = name;
    }

    public void read() {
        System.out.println(name + " opened");
    }

    public void write() {
        System.out.println(name + " saved");
    }
}
