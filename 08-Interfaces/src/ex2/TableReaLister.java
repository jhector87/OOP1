package ex2;

import java.util.ArrayList;
import java.util.List;

public class TableReaLister {

    public static void main(String[] args) {
        List<Table> list = new ArrayList<>();
        list.add(new CircularTable(0.75));
        list.add(new RectangularTable(3,1));
        list.add(new RectangularTable(1,0.75));
        list.add(new CircularTable(0.75));
        list.add(new CircularTable(2.35));
        list.add(new RectangularTable(2.75, 3.25));

        for (Table t : list) {
            System.out.println(t + "; Area: " + t.getArea());
        }
    }
}
