package HW_01;

public class Eggs extends Food{
    protected Integer amount;
    public Eggs(String name, Integer price, Integer amount, String unit, 
                String dateOfEnd) {
        super(name, price, amount, unit, dateOfEnd);
        this.amount = amount;
    }
}