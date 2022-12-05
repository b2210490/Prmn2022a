package lecture05;

import java.sql.ClientInfoStatus;
import java.util.*;

public class Exercise5_7 {
    public static void main(String[] args) {
        List<Insect> list = new ArrayList<>();
        list.add(new Insect());
        list.add(new Butterfly());
        list.add(new Locust());
        list.add(new SwallowtailButterfly());

        for (Insect insect : list) {
            insect.move();
        }
    }
}
