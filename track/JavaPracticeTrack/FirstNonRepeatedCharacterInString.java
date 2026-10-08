
import java.util.Scanner;

class FirstNonRepeatedCharacterInString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(j) == str.charAt(i)) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                System.out.println(str.charAt(i));
                break;
            } else {
                System.out.println("No non-repeated character found");
                break;
            }
        }
    }
}
