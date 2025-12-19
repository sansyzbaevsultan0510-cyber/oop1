class Main {  // Убрал 'public'
    public static void main(String[] args ) {  // Параметр 'args' можно удалить, если не используется
        Sport football = new Sport("Football");
        Sport tennis = new Sport("Tennis");

        Player p1 = new Player("Uali", football);
        Player p2 = new Player("Yeraly", tennis);

        System.out.println(football.name);
        System.out.println(tennis.name);
        System.out.println(p1.name + " plays " + p1.sport.name);
        System.out.println(p2.name + " plays " + p2.sport.name);

        if (p1.sport.name.equals(p2.sport.name)) {
            System.out.println("Players play the same sport");
        } else {
            System.out.println("Players play different sports");
        }
    }
}

class Sport {
    String name;

    Sport(String name) {
        this.name = name;
    }
}

class Player {
    String name;
    Sport sport;

    Player(String name, Sport sport) {
        this.name = name;
        this.sport = sport;
    }
}
