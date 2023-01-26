package D3;

public class Games {
    String name;
    int preis;
    int grösse;
    Boolean gekauft;

    public Games(String name, int preis, int grösse, Boolean gekauft) {
        this.name = name;
        this.preis = preis;
        this.grösse = grösse;
        this.gekauft = gekauft;
    }

    public String getName() {
        return this.name;
    }

    public int getPreis() {
        return this.preis;
    }

    public int getGrösse() {
        return this.grösse;
    }

    public Boolean getGekauft() {
        return this.gekauft;
    }

    public void setGekauft(Boolean gekauft) {
        this.gekauft = gekauft;
    }
}
