package HW_03;

public class Circle extends Figure {
    protected double radius;

    public Circle(double radius) throws Exception {
        this.radius = radius;
        if (radius <= 0){
            throw new Exception(String.format("Такой круг не полусится!!"));
        }
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ", " + "Радиус: " + this.radius +
                ", " + "Длина окружности: " + this.circumference();
    }
}
