import java.util.Scanner;

class BuildYourFirstEncapsulatedLearner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        Learner learner = new Learner();
        learner.setAge(age);

        System.out.println(learner.getAge());
    }
}

class Learner {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}