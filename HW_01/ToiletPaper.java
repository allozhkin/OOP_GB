package HW_01;

public class ToiletPaper extends Hygiene{
    protected Integer layer;
    public ToiletPaper(String name, Integer price, Integer amount, String unit, 
    Integer pieces, Integer layer) {
        super(name, price, amount, unit, pieces);
        this.layer = layer;
    }
    public Integer getLayer() {
        return layer;
    }
    
}
