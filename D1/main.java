package D1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        konto konto1 = new konto(1, 240);
        konto konto2 = new konto(2, 1);
        konto konto3 = new konto(3, 1200);

        Scanner kontoScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Was wollen Sie machen?");
            System.out.println("1. Saldo");
            System.out.println("2. Einzahlen");
            System.out.println("3. Abheben");
            int auswahl = kontoScanner.nextInt();
            switch (auswahl) {
                case 1:
                    saldo(konto1, konto2, konto3);
                    break;
                case 2:
                    einzahlen(konto1, konto2, konto3);
                    break;
                case 3:
                    abheben(konto1, konto2, konto3);
                    break;
            }
        }
    }

    public static void saldo(konto konto1, konto konto2, konto konto3) {
        Scanner kontoAuswahl = new Scanner(System.in);
        System.out.println("Von welchem Konto wollen Sie den Saldo wissen?");
        int konto = kontoAuswahl.nextInt();
        switch (konto) {
            case 1:
                System.out.println("Der Saldo beträgt " + konto1.getSaldo());
                break;
            case 2:
                System.out.println("Der Saldo beträgt " + konto2.getSaldo());
                break;
            case 3:
                System.out.println("Der Saldo beträgt " + konto3.getSaldo());
                break;
        }
    }

    public static void einzahlen(konto konto1, konto konto2, konto konto3) {
        Scanner kontoAuswahl = new Scanner(System.in);
        System.out.println("In welches Konto wollen Sie einzahlen?");
        int konto = kontoAuswahl.nextInt();
        switch (konto) {
            case 1:
                System.out.println("Wie viel wollen Sie einzahlen?");
                int betrag = kontoAuswahl.nextInt();
                konto1.einzahlen(betrag);
                System.out.println("Sie haben " + betrag + " auf das Konto " + konto1.getKontoNr() + " eingezahlt");
                break;
            case 2:
                System.out.println("Wie viel wollen Sie einzahlen?");
                int betrag1 = kontoAuswahl.nextInt();
                konto2.einzahlen(betrag1);
                System.out.println("Sie haben " + betrag1 + " auf das Konto " + konto2.getKontoNr() + " eingezahlt");
                break;
            case 3:
                System.out.println("Wie viel wollen Sie einzahlen?");
                int betrag2 = kontoAuswahl.nextInt();
                konto3.einzahlen(betrag2);
                System.out.println("Sie haben " + betrag2 + " auf das Konto " + konto3.getKontoNr() + " eingezahlt");
                break;
        }
    }

    public static void abheben(konto konto1, konto konto2, konto konto3) {
        Scanner kontoAuswahl = new Scanner(System.in);
        System.out.println("Von welchem Konto wollen Sie abheben?");
        int konto = kontoAuswahl.nextInt();
        switch (konto) {
            case 1:
                System.out.println("Wie viel wollen Sie abheben?");
                int betrag = kontoAuswahl.nextInt();
                konto1.abheben(betrag);
                System.out.println("Sie haben " + betrag + " vom Konto " + konto1.getKontoNr() + " abgehoben");
                break;
            case 2:
                System.out.println("Wie viel wollen Sie abheben?");
                int betrag1 = kontoAuswahl.nextInt();
                konto2.abheben(betrag1);
                System.out.println("Sie haben " + betrag1 + " vom Konto " + konto2.getKontoNr() + " abgehoben");
                break;
            case 3:
                System.out.println("Wie viel wollen Sie abheben?");
                int betrag2 = kontoAuswahl.nextInt();
                konto3.abheben(betrag2);
                System.out.println("Sie haben " + betrag2 + " vom Konto " + konto3.getKontoNr() + " abgehoben");
                break;
        }
    }
}