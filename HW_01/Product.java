package HW_01;

public class Product {
    /**
     * Наименование товара
     */
    protected String name;
    /**
     * Цена товара
     */
    protected Integer price;
    /**
     * Количество товара
     */
    protected Integer amount;
    /**
     * Единица измерения
     */
    protected String unit;

    public Product(String name, Integer price, Integer amount, String unit) {
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name + ", Цена товара: " + price + ", Количество товара: " +
                amount + ", Единица измерения: " + unit;
    }
}
