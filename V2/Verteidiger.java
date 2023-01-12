package V2;

public class Verteidiger extends Spieler {
    public Verteidiger(String name) {
        super(name);
    }

    @Override
    public String spielen() {
        return "Ich bin ein Verteidiger";
    }
}
