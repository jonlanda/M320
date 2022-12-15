package D2;

import java.util.ArrayList;
import java.util.List;

public class Flug {
    List<Passagier> passagiere = new ArrayList<Passagier>();

    void passagiereAusgeben() {
        for (Passagier p : passagiere) {
            p.getName();
        }
    }

    void addPassagier(Passagier passagier) {
        passagiere.add(passagier);
    }
}
