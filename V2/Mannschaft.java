package V2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;

public class Mannschaft {
    static AbstractList<Angreifer> angreifer = new ArrayList<Angreifer>();
    static AbstractList<Verteidiger> verteidiger = new ArrayList<Verteidiger>();
    static AbstractList<Goalie> goalies = new ArrayList<Goalie>();

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            angreifer.add(new Angreifer(Integer.toString(i)));
        }

        for (int i = 0; i < 4; i++) {
            verteidiger.add(new Verteidiger(Integer.toString(i)));
        }

        for (int i = 0; i < 1; i++) {
            double randomDouble = new Random().nextDouble() + 170;
            goalies.add(new Goalie(Integer.toString(i), randomDouble));
        }

        System.out.println(new Spieler("Name").spielen());
        System.out.println(angreifer.get(0).spielen());
        System.out.println(verteidiger.get(0).spielen());
        System.out.println(goalies.get(0).spielen());

    }
}
