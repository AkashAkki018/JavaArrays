import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private String position;
    private int jerseyNumber;

    // Constructor
    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    // Method to display player information
    @Override
    public String toString() {
        return name + " - Position: " + position + ", Jersey Number: " + jerseyNumber;
    }
}

public class AccentureEx4 {

    // Method to create a football team
    public static List<Player> createFootballTeam() {
        List<Player> team = new ArrayList<>();

        // Adding players to the team
        team.add(new Player("John Smith", "Goalkeeper", 1));
        team.add(new Player("Michael Johnson", "Defender", 2));
        team.add(new Player("David Adams", "Midfielder", 8));
        team.add(new Player("James Clark", "Forward", 9));
        team.add(new Player("Luke Walker", "Forward", 11));

        return team;
    }

    // Method to display the team
    public static void displayTeam(List<Player> team) {
        System.out.println("Football Team:");
        for (Player player : team) {
            System.out.println(player);
        }
    }

    public static void main(String[] args) {
        // Form and display the football team
        List<Player> team = createFootballTeam();
        displayTeam(team);
    }
}
