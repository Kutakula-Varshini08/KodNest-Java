
public class ArrayMutationTracker {

    public static void main(String[] args) {

        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        int[] snapshot = new int[4];

        for (int i = 0; i <= snapshot.length - 1; i++) {
            snapshot[i] = readings[i];
        }

        readings[updateIndex] = newValue;

        System.out.print("Snapshot: ");
        for (int i = 0; i <= snapshot.length - 1; i++) {
            System.out.print(snapshot[i] + " ");
        }

        System.out.println();

        System.out.print("Updated: ");
        for (int i = 0; i <= readings.length - 1; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}
