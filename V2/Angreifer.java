package V2;

public class Angreifer extends Spieler {
    public Angreifer(String name) {
        super(name);
    }

    public void jogTraining() {
    }

    @Override
    public String spielen() {
        return "Ich bin ein Angreifer";
    }
}
