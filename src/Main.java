public class Main {

    public static void main(String[] args) {
        Sport football = new Sport("Football", 11);
        Sport tennis = new Sport("Tennis", 1);
        Player player1 = new Player("Uali", 18, football);
        Player player2 = new Player("Yeraly", 18, tennis);
        SportsClub club = new SportsClub("BDA2509", "Astana");
        System.out.println(football);
        System.out.println(tennis);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(club);
        System.out.println("Players play the same sport: " +
                player1.getSport().getName().equals(player2.getSport().getName()));
    }
}
class Sport {
    private String name;
    private int teamSize;
    public Sport(String name, int teamSize) {
        this.name = name;
        this.teamSize = teamSize;
    }
    public String getName() {
        return name;
    }
    public int getTeamSize() {
        return teamSize;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public String toString() {
        return "Sport: " + name + ", Team size: " + teamSize;
    }
}
class Player {
    private String name;
    private int age;
    private Sport sport;
    public Player(String name, int age, Sport sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Sport getSport() {
        return sport;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public String toString() {
        return "Player: " + name + ", Age: " + age + ", Sport: " + sport.getName();
    }
}
class SportsClub {
    private String clubName;
    private String city;
    public SportsClub(String clubName, String city) {
        this.clubName = clubName;
        this.city = city;
    }
    public String getClubName() {
        return clubName;
    }
    public String getCity() {
        return city;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Sports Club: " + clubName + ", City: " + city;
    }
}
