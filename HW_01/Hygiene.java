package HW_01;

public class Hygiene extends Product {
    /**
     * Колличество штук в уапаковке
     */
    protected Integer pieces;

    public Hygiene(String name, Integer price, Integer amount, String unit, Integer pieces) {
        super(name, price, amount, unit);
        this.pieces = pieces;
    }

    public Integer getPieces() {
        return pieces;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name + ", Цена товара: " + price + ", Количество товара: " +
                amount + ", Единица измерения: " + unit + ", Количество штук в упаковке: " + pieces;
    }

}
