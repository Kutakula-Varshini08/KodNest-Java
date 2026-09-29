
import java.util.Scanner;

public class ValidateStudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();
        Student s = new Student();

        if (s.setMarks(marks)) {
            System.out.println(s.getMarks());
        } else {
            System.out.println("Invalid marks");
        }
    }
}

class Student {

    private int marks;

    public boolean setMarks(int marks) {
        this.marks = marks;
        if (marks >= 0 && marks <= 100) {
            return true;
        }
        return false;
    }

    public int getMarks() {
        return marks;
    }
}
