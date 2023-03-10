package HW_02;

public abstract class Bird extends Animal {
    private Integer flyingHigh;

    public Bird(Integer height, Integer weight, String eyes, Integer flyingHigh) {
        super(height, weight, eyes);
        this.flyingHigh = flyingHigh;
    }

    public Integer getFlyingHigh() {
        return flyingHigh;
    }

    private void setFlyingHigh(Integer flyingHigh) {
        this.flyingHigh = flyingHigh;
    }

    public void iFly() {
        System.out.printf("Я лечу на %d метрах", flyingHigh);
    }

}
