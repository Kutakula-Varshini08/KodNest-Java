
import java.util.Scanner;

class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < result.length(); j++) {
                if (str.charAt(i) == result.charAt(j)) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
