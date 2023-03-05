package HW_01;

public class Diapers extends Children {
    protected Integer size;
    protected Integer minWeight;
    protected Integer maxWeight;
    protected String type;

    public Diapers(String name, Integer price, Integer amount, String unit, Integer minAge,
            String alergen, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, amount, unit, minAge, alergen);
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.size = size;
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getMinWeight() {
        return minWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Подгузники - марка: " + name + ", Цена товара: " + price + ", Количество товара: " +
                amount + ", Единица измерения: " + unit + ", Минимальный возраст: " + minAge +
                ", Гипоалергенность" + allergen + ", размер: " + size + ", минимальный вес: " +
                minWeight + ", максимальный вес: " + maxWeight + ", тип: " + type;
    }
}
