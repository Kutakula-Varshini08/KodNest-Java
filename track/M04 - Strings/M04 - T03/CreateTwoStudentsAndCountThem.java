
import java.util.Scanner;

class CreateTwoStudentsAndCountThem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();

        Student s1 = new Student(one);
        Student s2 = new Student(two);

        System.out.println("Student: " + s1.name);
        System.out.println("Student: " + s2.name);
        System.out.println("Total students: " + Student.count);
    }
}

class Student {

    String name;
    static int count;

    Student(String name) {
        this.name = name;
        count++;
    }
}
