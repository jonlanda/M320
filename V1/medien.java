package V1;

public class medien {
    public String titel;
    public int jahr;
    public int preis;

    public medien(String titel, int jahr, int preis) {
        this.titel = titel;
        this.jahr = jahr;
        this.preis = preis;
    }

    String getTitel() {
        return this.titel;
    }

    int getJahr() {
        return this.jahr;
    }

    int getPreis() {
        return this.preis;
    }

    @Override
    public String toString() {
        return "Titel: " + titel + "; Jahr: " + jahr + "; Preis: " + preis;
    }
}
