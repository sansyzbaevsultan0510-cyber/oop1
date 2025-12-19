public class Main {
    public static void main(String[] args ) {
        Sport football = new Sport("Football");
        Sport tennis = new Sport("Tennis");
        Player p1 = new Player("Uali", football);
        Player p2 = new Player("Yeraly", tennis);
        SportsClub club = new SportsClub("BDA2509");
        System.out.println(football.getName());
        System.out.println(tennis.getName());
        System.out.println(p1.getName() + " plays " + p1.getSport().getName());
        System.out.println(p2.getName() + " plays " + p2.getSport().getName());
        System.out.println("Club name: " + club.getName());
        if (p1.getSport().getName().equals(p2.getSport().getName())) {
            System.out.println("Players play the same sport");
        } else {
            System.out.println("Players play different sports");
        }
    }
}
class Sport {
    private String name;
    public Sport(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Player {
    private String name;
    private Sport sport;
    public Player(String name, Sport sport) {
        this.name = name;
        this.sport = sport;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sport getSport() {
        return sport;
    }
    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
class SportsClub {
    private String name;
    public SportsClub(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
