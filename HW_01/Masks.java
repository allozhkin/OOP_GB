package HW_01;

public class Masks extends Hygiene {

    public Masks(String name, Integer price, Integer amount, String unit, Integer pieces) {
        super(name, price, amount, unit, pieces);
    }

    @Override
    public String toString() {
        return "Маски - название товара: " + name + ", Цена товара: " + price + ", Количество товара: "
                + amount + ", Единица измерения: " + unit + ", Количество штук в упаковке: " + pieces;
    }

}
