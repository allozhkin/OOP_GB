package HW_01;

public class Eggs extends Food {

    public Eggs(String name, Integer price, Integer amount, String unit,
            String dateOfEnd) {
        super(name, price, amount, unit, dateOfEnd);
    }

    @Override
    public String toString() {
        return "Яйца - марка товара: " + name + ", Цена товара: " + price + ", Количество товара: " +
                amount + ", Единица измерения: " + unit + ", срок годности: " + dateOfEnd;
    }
}