package HW_01;

public class Food extends Product {
    /**
     * Срок годности
     */
    protected String dateOfEnd;
    public Food(String name, Integer price, Integer amount, String unit, String dateOfEnd) {
        super(name, price, amount, unit);
        this.dateOfEnd = dateOfEnd;
    }
    
    public String getDateOfEnd() {
        return dateOfEnd;
    }
}
