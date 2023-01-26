package D3;

public class User {
    String name;
    int guthaben;

    public User(String name, int guthaben) {
        this.name = name;
        this.guthaben = guthaben;
    }

    public String getName() {
        return this.name;
    }

    public int getGuthaben() {
        return this.guthaben;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGuthaben(int guthaben) {
        this.guthaben = guthaben;
    }
}
