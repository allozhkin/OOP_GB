package HW_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Polygon
 */
public class Polygon extends Figure {

    protected List<Double> sides = new ArrayList<>();

    protected Polygon(double... sides) throws Exception {
        for (double side : sides) {
            if (side <= 0) {
                throw new Exception("Так не получится");
            }
        }
    }

    public double perimeter() {
        double sum = 0;
        for (double side : this.sides) {
            sum += side;
        }
        return sum;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " + "Стороны: " + sides +
                ", " + "Периметр: " + this.perimeter();
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

}