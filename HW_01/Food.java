package HW_01;

public class Food extends Product {
    /**
     * Срок годности
     */
    protected String dateOfEnd;

    public Food(String name, Integer price, Integer amount, String unit, String dateOfEnd) {
        super(name, price, amount, unit);
        this.dateOfEnd = dateOfEnd;
    }

    public String getDateOfEnd() {
        return dateOfEnd;
    }

    @Override
    public String toString() {
        return "Продукты - название товара: " + name + ", Цена товара: " + price +
                ", Количество товара: " + amount + ", Единица измерения: " + unit +
                ", срок годности: " + dateOfEnd;
    }
}
