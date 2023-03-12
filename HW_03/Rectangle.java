package HW_03;

/**
 * Rectangle
 */
public class Rectangle extends Polygon{

    public Rectangle(double sideA, double sideB) throws Exception{
        super(sideA, sideB);
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideA);
        this.sides.add(sideB);
    }

    @Override
    public double area() {
        return this.sides.get(0) * this.sides.get(1);
    }
}