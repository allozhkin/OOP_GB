package HW_03;

public class Main {
    public static void main(String[] args) throws Exception {
        Figures figures = new Figures();
        figures.add(new Rectangle(13, 5));
        figures.add(new Square(3));
        figures.add(new Triangle(3, 6, 4));
        figures.add(new Circle(3));

        System.out.println("До сортировки:");
        figures.showAllInfo();

        System.out.println("\nПосле сортировки:");
        figures.sortByArea();
        figures.showAllInfo();

        System.out.println("\nПосле удаления третьей фигуры:");
        figures.remove(2);
        figures.showAllInfo();

        System.out.println("\nПосле замены третей фигуры на квадрат со стороной 10:");
        figures.set(2, new Square(10));
        figures.showAllInfo();
    }
}