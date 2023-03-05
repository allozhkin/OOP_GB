package HW_01;

public class ToiletPaper extends Hygiene {
    protected Integer layer;

    public ToiletPaper(String name, Integer price, Integer amount, String unit,
            Integer pieces, Integer layer) {
        super(name, price, amount, unit, pieces);
        this.layer = layer;
    }

    public Integer getLayer() {
        return layer;
    }

    @Override
    public String toString() {
        return "Товары гигиены - название товара: " + name + ", Цена товара: " +
                price + ", Количество товара: " + amount + ", Единица измерения: " + unit +
                ", Количество штук в упаковке: " + pieces + ", количество слоев: " + layer;
    }
}
