
import java.util.Scanner;

public class ProtectAStudentAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        Student s = new Student();
        s.setAge(age);
        System.out.println(s.displayAge());
    }
}

class Student {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int displayAge() {
        return age;
    }
}
