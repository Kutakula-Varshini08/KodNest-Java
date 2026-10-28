
import java.util.Scanner;

public class BuildATeamAggregationModel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        String coachName = scanner.nextLine();
        Coach c = new Coach(coachName);
        Team t = new Team(teamName, c);
        t.showDetails();
        scanner.close();
    }
}

class Coach {

    private String name;

    Coach(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Team {

    private String name;
    private Coach coach;

    Team(String name, Coach coach) {
        this.name = name;
        this.coach = coach;
    }

    void showDetails() {
        System.out.println("Team: " + name);
        System.out.println("Coach: " + coach.getName());
    }
}
