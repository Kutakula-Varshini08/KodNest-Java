
class CreateAndCallingAMethod {

    public static void main(String[] args) {
        Robot r = new Robot();
        r.speak();
    }
}

class Robot {

    void speak() {
        System.out.println("Beep beep! Java is my superpower!");
    }
}
