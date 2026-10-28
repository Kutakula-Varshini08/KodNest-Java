
import java.util.Scanner;

public class StudentHasAnAddress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        String city = scanner.nextLine();
        Address a = new Address(city);
        Student s = new Student(studentName, a);
        s.showDetails();
        scanner.close();
    }
}

class Address {

    private String city;

    Address(String city) {
        this.city = city;
    }

    String getName() {
        return city;
    }
}

class Student {

    private String studentName;
    private Address address;

    Student(String studentName, Address address) {
        this.studentName = studentName;
        this.address = address;
    }

    void showDetails() {
        System.out.println(studentName + " lives in " + address.getName());
    }
}
