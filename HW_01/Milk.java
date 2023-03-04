package HW_01;

public class Milk extends Drinks{

    protected Double fat;
    protected String dateOfEnd;
    /**
     * @param name   Наименование товара
     * @param price  Цена товара
     * @param amount количество в упаковке
     * @param unit   Еденица измерения
     * @param value  Объем
     * @param fat    Процент жирности
     * @param dateOfEnd   Срок годности
     */
    public Milk(String name, Integer price, Integer amount, String unit, Integer value, 
                Double fat, String dateOfEnd) {
        super(name, price, amount, unit, value);
        this.fat = fat;
        this.dateOfEnd = dateOfEnd;
    }
    

    public String getDateOfEnd() {
        return dateOfEnd;
    }
    public Double getFat() {
        return fat;
    }

}
