package V1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        dvd dvd1 = new dvd("titanic", 1678, 9, 160);
        cd cd1 = new cd("Doraemon", 1969, 25, "El Gato Cosmico");
        buch buch1 = new buch("Harry Potter", 1997, 15, 123456);
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(dvd1);
        list.add(cd1);
        list.add(buch1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).toString() + "\n");
        }
    }
}