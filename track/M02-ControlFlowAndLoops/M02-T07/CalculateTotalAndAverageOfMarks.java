
public class CalculateTotalAndAverageOfMarks {

    public static void main(String[] args) {

        int[] marks = {70, 80, 60, 90, 50};
        int total = 0;
        int count = 0;

        for (int i = 0; i <= marks.length - 1; i++) {
            total = total + marks[i];
            count++;
        }

        double average = total / count;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
