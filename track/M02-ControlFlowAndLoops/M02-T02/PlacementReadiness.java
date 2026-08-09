
public class PlacementReadiness {

    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        String placementReady = (marks >= 60 && attendance >= 75) ? "Placement Ready" : "Continue Preparation";
        System.out.println(placementReady);

        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}
