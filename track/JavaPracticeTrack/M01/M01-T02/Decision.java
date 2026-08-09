
class Decision {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        boolean eligibility = (marks >= 60 && attendance >= 75 && activeBacklog) ? true : false;
        if (eligibility) {
            System.out.println("Improve Academic Eligibility");
        } else if (eligibility == true && projectCompleted == false) {
            System.out.println("Complete the Project");
        } else if (projectCompleted == true && mockInterviewScore < 70) {
            System.out.println("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");
        }
    }
}
