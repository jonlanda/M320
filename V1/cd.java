package V1;

public class cd extends medien {
    public String bandname;

    public cd(String titel, int jahr, int preis, String bandname) {
        super(titel, jahr, preis);
        this.bandname = bandname;
    }

    @Override
    public String toString() {
        return "Titel: " + titel + "; Jahr: " + jahr + "; Preis: " + preis + "; Bandname: " + bandname;
    }
}
