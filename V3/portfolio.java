package V3;

import java.util.ArrayList;
import java.util.List;

import V3.stockExchange.StockExchange;

public class portfolio {
    List<aktie> aktien = new ArrayList();

    void getAktien() {
        for (aktie a : aktien) {
            System.out.println("Name: " + a.getName() + " Price: " + a.getValue());
        }
    }

    void addAktie(aktie aktie) {
        aktien.add(aktie);
    }
}
