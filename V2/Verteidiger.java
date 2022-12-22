package V2;

public class Verteidiger extends Spieler {
    /**
     * @param name the name of the player
     */
    public Verteidiger(String name) {
        super(name);
    }

    /**
     * @return 'Ich bin ein' + Player Type
     */
    @Override
    public String spielen() {
        return "Ich bin ein Verteidiger";
    }
}
