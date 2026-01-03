import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[3];
        players[0] = new FootballPlayer("Uali", 18);
        players[1] = new TennisPlayer("Yeraly", 19);
        players[2] = new FootballPlayer("Altai", 17);
        System.out.println("All players:");
        for (Player p : players) {
            System.out.println(p);
        }
        System.out.print("\nEnter player name to search: ");
        String search = sc.nextLine();
        for (Player p : players) {
            if (p.getName().equals(search)) {
                System.out.println("Found: " + p);
            }
        }
        System.out.println("\nFootball players:");
        for (Player p : players) {
            if (p instanceof FootballPlayer) {
                System.out.println(p);
            }
        }
        Arrays.sort(players);
        System.out.println("\nSorted by name:");
        for (Player p : players) {
            System.out.println(p);
        }
        System.out.println("\nCompare first and third player:");
        System.out.println(players[0].equals(players[2]));
    }
}
