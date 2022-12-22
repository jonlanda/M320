package V2;

public class Goalie extends Spieler {
    private double koerperGroesse;

    public Goalie(String name, double koerperGroesse) {
        super(name);
        this.koerperGroesse = koerperGroesse;
    }

    @Override
    public String spielen() {
        return "Ich bin ein Goalie";
    }
}
