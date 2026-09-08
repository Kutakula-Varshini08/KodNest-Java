
class StringEqualsIgnoreCaseMethod {

    public static void main(String[] args) {
        String s1 = "Varshini";
        String s2 = "VARSHINI";
        if (s1 == s2) {
            System.out.println("Refernces are same");
        } else {
            System.out.println("Refernces are different");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are different");
        }
    }
}
