package D3;

import java.util.ArrayList;
import java.util.List;

public class playstation {
    String name;
    int speicher;
    User user;
    List<Games> games = new ArrayList<Games>();

    public playstation(String name, int speicher, User user, List<Games> games) {
        this.name = name;
        this.speicher = speicher;
        this.user = user;
        this.games = games;
    }

    public int getSpeicher() {
        return this.speicher;
    }

    public void setSpeicher(int speicher) {
        this.speicher = speicher;
    }

    public User getUser() {
        return this.user;
    }

    public void getGames() {
        for (Games g : games) {
            System.out.println("Name: " + g.getName());
            System.out.println("Preis: " + g.getPreis() + "CHF");
            System.out.println("Grösse: " + g.getGrösse() + "GB");
            System.out.println("------------------------");
        }
    }

    public void buyGame(String gameName) {
        for (Games g : games) {
            if (g.getName().equals(gameName)) {
                if (g.getGekauft() == true) {
                    System.out.println("SIE HABEN DIESES SPIEL SCHON MAL GEKAUFT!");
                } else {
                    int newSpeicher = this.speicher - g.getGrösse();
                    if (newSpeicher <= 0) {
                        System.out.println("NICHT GENUG SPEICHERPLATZ!");
                    } else {
                        int newGuthaben = user.getGuthaben() - g.getPreis();
                        if (newGuthaben <= 0) {
                            System.out.println("NICHT GENUG GUTHABEN!");
                        } else {
                            setSpeicher(newSpeicher);
                            user.setGuthaben(newGuthaben);
                            g.setGekauft(true);
                            System.out.println("KAUF WAR ERFOLGREICH!");
                        }
                    }
                }
            }
        }
    }
}
