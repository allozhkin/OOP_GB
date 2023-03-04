package HW_01;

public class Bread extends Food{
    protected String flour;


    public Bread(String name, Integer price, Integer amount, String unit, 
                String dateOfEnd, String flour) {
        super(name, price, amount, unit, dateOfEnd);
        this.flour = flour;
    }
    public String getFlour() {
        return flour;
    }
    
}
