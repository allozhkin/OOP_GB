package HW_01;

public class Children extends Product {
    protected Integer minAge;
    protected String allergen;
    
    
    /**
     * @param name    Наименование товара
     * @param price   Цена товара
     * @param amount   количество в упаковке
     * @param unit      Еденица измерения
     * @param minAge   МИнимальный возраст
     * @param alergen  Гипоалергенность
     */
    public Children(String name, Integer price, Integer amount, String unit, Integer minAge, String alergen) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.allergen = alergen;
    }
    
    public Integer getMinAge() {
        return minAge;
    }
    public String getAllergen() {
        return allergen;
    }
    
}
