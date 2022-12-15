package D2;

public class Passagier {
    public String name;

    public Passagier(String name) {
        this.name = name;
    }

    void getName() {
        System.out.println(name);
    }

    void setName(String newName) {
        this.name = newName;
    }
}
