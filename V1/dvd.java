package V1;

public class dvd extends medien {
    public int filmlänge;

    public dvd(String titel, int jahr, int preis, int filmlänge) {
        super(titel, jahr, preis);
        this.filmlänge = filmlänge;
    }

    @Override
    public String toString() {
        return "Titel: " + titel + "; Jahr: " + jahr + "; Preis: " + preis + "; Filmlänge: " + filmlänge;
    }
}
