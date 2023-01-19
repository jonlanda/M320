package V3;

public class aktie {
    String name;
    int defaultValue;

    public aktie(String name, int defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
    }

    String getName() {
        return this.name;
    }

    int getValue() {
        return this.defaultValue;
    }
}
