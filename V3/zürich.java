package V3;

public class zürich implements börse2 {
    @Override
    public int getValue(String name) {
        int value = 0;
        if (name == "credit suisse") {
            value = 3;
        } else if (name == "microsoft") {
            value = 80;
        }
        return value;
    }
}
