
import java.util.Scanner;

public class InitializeConstructor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();

        Student s1 = new Student(fullName);

        s1.display();
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}
