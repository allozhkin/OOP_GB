package HW_02;

public class Chicken extends Bird implements Sound {

    public Chicken(Integer height, Integer weight, String eyes, Integer flyingHigh) {
        super(height, weight, eyes, flyingHigh);
    }

    @Override
    public void makeASound() {
        System.out.println("ko ko ko");

    }

    @Override
    public String getInfo() {
        return "Курица" + super.getInfo();
    }

    @Override
    public void iFly() {
        super.iFly();
    }

}
