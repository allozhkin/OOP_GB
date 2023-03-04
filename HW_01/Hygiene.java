package HW_01;

public class Hygiene extends Product{
    /**
     * Колличество штук в уапаковке
     */
    protected Integer pieces;

    
    public Hygiene(String name, Integer price, Integer amount, String unit, Integer pieces) {
        super(name, price, amount, unit);
        this.pieces = pieces;
    }
    public Integer getPieces() {
        return pieces;
    }
    
}
