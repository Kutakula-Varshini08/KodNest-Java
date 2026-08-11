
class StudentFiles {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 21;
        s1.name = "Varshini";
        s1.height = 5.6;
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.sleep();
        s1.eat();
    }
}

class Student {

    int rollNo;
    String name;
    double height;

    void sleep() {
        System.out.println("Sleeping");
    }

    void eat() {
        System.out.println("Eating");
    }
}
