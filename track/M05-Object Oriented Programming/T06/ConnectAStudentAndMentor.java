
import java.util.Scanner;

public class ConnectAStudentAndMentor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        String mentorName = scanner.nextLine();

        Student s = new Student(studentName);
        Mentor m = new Mentor(mentorName);

        s.learnFrom(m);
    }
}

class Mentor {

    private String name;

    Mentor(String name) {
        this.name = name;
    }

    void guide(String studentName) {
        System.out.println(name + " guides " + studentName);
    }
}

class Student {

    private String name;

    Student(String name) {
        this.name = name;
    }

    void learnFrom(Mentor mentor) {
        mentor.guide(name);
    }
}
