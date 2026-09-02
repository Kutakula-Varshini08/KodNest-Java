
import java.util.Scanner;

public class SalesAnalyzerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = scanner.nextInt();

        double[] dailySales = new double[numberOfDays];

        for (int i = 0; i < dailySales.length; i++) {
            dailySales[i] = scanner.nextDouble();
        }

        SalesAnalyzer analyzer = new SalesAnalyzer(dailySales);

        analyzer.displayReport();
    }
}

class SalesAnalyzer {

    double[] dailySales;

    SalesAnalyzer(double[] dailySales) {
        this.dailySales = dailySales;
    }

    double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < dailySales.length; i++) {
            total = total + dailySales[i];
        }
        return total;
    }

    double calculateAverage() {
        double total = calculateTotal();
        double average = total / dailySales.length;
        return average;
    }

    int findHighestSalesDay() {
        int highestIndex = 0;
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > dailySales[highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex + 1;
    }

    int findLowestSalesDay() {
        int lowestIndex = 0;
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < dailySales[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex + 1;
    }

    int countAboveAverageDays() {
        double average = calculateAverage();
        int count = 0;
        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > average) {
                count++;
            }
        }
        return count++;
    }

    void displayReport() {
        int highestDay = findHighestSalesDay();
        int lowestDay = findLowestSalesDay();

        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + calculateTotal());
        System.out.println("Average Sales: " + calculateAverage());
        System.out.println("Highest Sales Day: " + highestDay);
        System.out.println("Highest Sales: " + dailySales[highestDay - 1]);
        System.out.println("Lowest Sales Day: " + (lowestDay));
        System.out.println("Lowest Sales: " + dailySales[lowestDay - 1]);
        System.out.println("Days Above Average: " + countAboveAverageDays());
    }
}
