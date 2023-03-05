package HW_01;

public class Pacifier extends Children {

    public Pacifier(String name, Integer price, Integer amount, String unit, Integer minAge, String alergen) {
        super(name, price, amount, unit, minAge, alergen);
    }

    @Override
    public String toString() {
        return "Соски - название товара: " + name + ", Цена товара: " + price + ", Количество товара: "
                + amount + ", Единица измерения: " + unit + ", Минимальный возраст: " + minAge +
                ", Гипоалергенность" + allergen;
    }

}
