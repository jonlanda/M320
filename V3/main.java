package V3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        aktie aktie1 = new aktie("microsoft", 90);
        aktie aktie2 = new aktie("credit suisse", 2);
        portfolio portfolio = new portfolio();
        portfolio.addAktie(aktie1);
        portfolio.addAktie(aktie2);
        zürich zürich = new zürich();
        newyork newyork = new newyork();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ihre Aktien: \n");
            portfolio.getAktien();
            System.out.println("\n Für welche aktien wollen Sie den Preis wissen?");
            String antwort = scanner.nextLine();

            switch (antwort.toLowerCase()) {
                case "microsoft":
                    System.out.println("Preis in Zürich: " + zürich.getValueMicrosoft());
                    System.out.println("Preis in NY: " + newyork.getValueMicrosoft() + "\n");
                    break;
                case "credit suisse":
                    System.out.println("Preis in Zürich: " + zürich.getValueCreditSuisse());
                    System.out.println("Preis in NY: " + newyork.getValueCreditSuisse() + "\n");
                    break;
                default:
                    System.out.println("NOT A VALID STOCK");
            }
        }
    }
}
