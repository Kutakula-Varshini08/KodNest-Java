
import java.util.Scanner;

public class ChainStudentConstructorsUsingThis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Student s = new Student(name);

        s.display();
    }
}

class Student {

    private String name;
    private int age;

    Student(String name) {
        this(name, 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.print(name + " " + age);
    }
}
