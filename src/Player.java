public abstract class Player implements Comparable<Player> {
    private String name;
    private int age;
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public abstract String getSport();
    public String toString() {
        return name + ", age " + age + ", sport: " + getSport();
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return name.equals(p.name) && age == p.age && getSport().equals(p.getSport());
    }
    public int hashCode() {
        return name.hashCode() + age + getSport().hashCode();
    }
    public int compareTo(Player other) {
        return this.name.compareTo(other.name);
    }
}
