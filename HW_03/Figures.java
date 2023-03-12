package HW_03;

import java.util.ArrayList;
import java.util.Collections;

public class Figures {
    private ArrayList<Figure> figures = new ArrayList<>();

    public void showAllInfo() {
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public void remove(int i) {
        this.figures.remove(i);
    }

    public void set(int i, Figure figure) {
        this.figures.set(i, figure);
    }

    public void sortByArea() {
        Collections.sort(this.figures);
    }
}
