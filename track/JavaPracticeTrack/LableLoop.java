
class LableLoop {

    public static void main(String[] args) {
        Outer:
        for (int i = 1; i <= 4; i++) {
            Inner:
            for (int j = 1; j <= 4; j++) {
                if (i == 2) {
                    break Outer;
                }
                System.out.println("i: " + i + " j: " + j
                );
            }
        }
    }
}
