
import java.util.*;

class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);

        if (sortedStr1.equalsIgnoreCase(sortedStr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
