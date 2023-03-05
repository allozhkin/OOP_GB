package HW_01;

public class Children extends Product {
    protected Integer minAge;
    protected String allergen;

    /**
     * @param name     Наименование товара
     * @param price    Цена товара
     * @param amount   количество в упаковке
     * @param unit     Еденица измерения
     * @param minAge   МИнимальный возраст
     * @param allergen Гипоалергенность
     */
    public Children(String name, Integer price, Integer amount, String unit, Integer minAge, String allergen) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.allergen = allergen;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public String getAllergen() {
        return allergen;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name + ", Цена товара: " + price + ", Количество товара: " +
                amount + ", Единица измерения: " + unit + ", Минимальный возраст: " + minAge +
                ", Гипоалергенность" + allergen;
    }
}
