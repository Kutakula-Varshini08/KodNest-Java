
import java.util.Scanner;

public class CreateAnImmutableStudentRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String name = scanner.next();

        StudentRecord s = new StudentRecord(id, name);
        s.getters();

        scanner.close();
    }
}

final class StudentRecord {

    private final int id;
    private final String name;

    StudentRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void getters() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
