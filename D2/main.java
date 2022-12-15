package D2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Flug Flug1 = new Flug();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hallo, was möchten sie machen?\n");
            System.out.println("a) Passagierliste\n");
            System.out.println("b) Passagier eintragen\n");
            String antwort = scanner.nextLine();

            switch (antwort.toLowerCase()) {
                case "a":
                    Flug1.passagiereAusgeben();
                    break;
                case "b":
                    System.out.println("Wie soll der Passagier heissen?");
                    String name = scanner.nextLine();
                    Passagier neuPassagier = new Passagier(name);
                    Flug1.addPassagier(neuPassagier);
                default:
                    System.out.println("GEHT NICHT");
                    break;
            }
        }
    }
}
