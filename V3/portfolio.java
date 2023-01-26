package V3;

import java.util.ArrayList;
import java.util.List;

public class portfolio {
    List<aktie> aktien = new ArrayList();
    börse2 b;

    public portfolio(börse2 b) {
        this.b = b;
    }

    void getAktien() {
        for (aktie a : aktien) {
            System.out.println("Name: " + a.getName() + " Price: " + b.getValue(a.getName()));
        }
    }

    void addAktie(aktie aktie) {
        aktien.add(aktie);
    }

    public void setBörse(börse2 newBörse) {
        this.b = newBörse;
    }
}
