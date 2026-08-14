

class ConstructorOverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Tanusha");
        s2.display();
        Student s3 = new Student("Madhavi", 33, 5);
        s3.display();
    }

}

class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Varshini";
        age = 22;
        height = 5.5;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
