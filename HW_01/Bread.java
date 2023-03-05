package HW_01;

public class Bread extends Food {
    protected String flour;

    public Bread(String name, Integer price, Integer amount, String unit,
            String dateOfEnd, String flour) {
        super(name, price, amount, unit, dateOfEnd);
        this.flour = flour;
    }

    public String getFlour() {
        return flour;
    }

    @Override
    public String toString() {
        return "Хлеб - марка: " + name + ", Цена товара: " + price + ", Количество товара: " +
                amount + ", Единица измерения: " + unit + ", срок годности: " + dateOfEnd
                + ", тип муки: " + flour;
    }

}
