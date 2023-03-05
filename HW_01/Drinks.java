package HW_01;

public class Drinks extends Product {
    /**
     * Объем
     */
    protected Integer value;

    public Drinks(String name, Integer price, Integer amount, String unit, Integer value) {
        super(name, price, amount, unit);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name + ", Цена товара: " + price + ", Количество товара: " +
                amount + ", Единица измерения: " + unit + ", объем: " + value;
    }
}
