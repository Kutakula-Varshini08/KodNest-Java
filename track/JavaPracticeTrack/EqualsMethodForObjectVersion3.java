
import java.util.Objects;

class EqualsMethodForObjectVersion3 {

    public static void main(String[] args) {
        Student s1 = new Student(11, "Madhu");
        Student s2 = new Student(12, "Tanu");
        Student s3 = new Student(11, "Madhu");
        // s1.display();
        // s2.display();
        // s3.display();
        Object s4 = new Student(22, "Ravi");
        System.out.println(s1.getClass());
        System.out.println(s4.getClass());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

class Student {

    int roll;
    String name;

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(roll, name);
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return roll + " " + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }

}
