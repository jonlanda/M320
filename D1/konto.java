package D1;

public class konto {
    public int kontoNr;
    public int saldo;

    public konto(int kontoNr, int saldo) {
        this.kontoNr = kontoNr;
        this.saldo = saldo;
    }

    int getKontoNr() {
        return this.kontoNr;
    }

    int getSaldo() {
        return this.saldo;
    }

    public void einzahlen(int betrag) {
        this.saldo = this.saldo + betrag;
    }

    public void abheben(int betrag) {
        if (this.saldo < betrag) {
            System.out.println("You don't have enough money");
        } else {
            this.saldo = this.saldo - betrag;
        }
    }
}
