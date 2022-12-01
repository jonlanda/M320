package V1;

public class buch extends medien {
    public int ISBNnummer;

    public buch(String titel, int jahr, int preis, int ISBNnummer) {
        super(titel, jahr, preis);
        this.ISBNnummer = ISBNnummer;
    }

    @Override
    public String toString() {
        return "Titel: " + titel + "; Jahr: " + jahr + "; Preis: " + preis + "; ISBN-Nummer: " + ISBNnummer;
    }
}
