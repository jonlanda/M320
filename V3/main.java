package V3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        aktie aktie1 = new aktie("microsoft");
        aktie aktie2 = new aktie("credit suisse");
        zürich zürich = new zürich();
        newyork newyork = new newyork();
        portfolio portfolio = new portfolio(zürich);
        portfolio.addAktie(aktie1);
        portfolio.addAktie(aktie2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n Für welche Börse wollen Sie den Preis Ihrer Aktien wissen? \n");
            System.out.println("a) Zürich\n");
            System.out.println("b) New York\n");
            String antwort = scanner.nextLine();

            switch (antwort.toLowerCase()) {
                case "a":
                    portfolio.setBörse(zürich);
                    portfolio.getAktien();
                    break;
                case "b":
                    portfolio.setBörse(newyork);
                    portfolio.getAktien();
                    break;
                default:
                    System.out.println("NOT A VALID BÖRSE");
            }
        }
    }
}
