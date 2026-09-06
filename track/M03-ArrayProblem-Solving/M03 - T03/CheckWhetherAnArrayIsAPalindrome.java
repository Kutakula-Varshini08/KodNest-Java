
import java.util.Scanner;

class CheckWhetherAnArrayIsAPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int result = 1;

        while (left < right) {
            if (numbers[left] != numbers[right]) {
                result = 0;
                break;
            }

            left++;
            right--;
        }

        System.out.println(result);

        scanner.close();
    }
}
