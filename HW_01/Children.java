package HW_01;

public class Children extends Product {
    /**
     * МИнимальный возраст
     */
    protected Integer minAge;
    
    /**
     * Гипоалергенность
     */
    protected String allergen;
    
    
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
