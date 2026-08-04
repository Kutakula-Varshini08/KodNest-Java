
class Calculate {

    public static void main(String[] args) {
        float principal = 10000.0f;
        float rate = 6.5f;
        float time = 2.0f;
        double weight = 72.0;
        double height = 1.8;
        int marks1 = 78;
        int marks2 = 84;
        int marks3 = 69;
        int marks4 = 91;
        int marks5 = 88;
        double simpleInterest = principal * rate * time / 100.0;
        double totalAmount = principal + simpleInterest;
        double bmi = weight / (height * height);
        int totalmarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (totalmarks * 100.0) / 500;
        System.out.println("Simple Interest:" + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage:" + percentage);
    }
}
