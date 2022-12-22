package V2;

public class Spieler {
    private String name;

    public String zeigName() {
        return name;
    }

    public Spieler(String name) {
        this.name = name;
    }

    public String spielen() {
        return "Ich bin ein Spieler";
    }
}
