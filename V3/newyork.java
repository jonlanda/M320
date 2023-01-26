package V3;

public class newyork implements börse2 {

    @Override
    public int getValue(String name) {
        int value = 0;
        if (name == "credit suisse") {
            value = 1;
        } else if (name == "microsoft") {
            value = 120;
        }
        return value;
    }

}