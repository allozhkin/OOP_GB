package HW_02;

public class Stork extends Bird implements Sound {

    public Stork(Integer height, Integer weight, String eyes, Integer flyingHigh) {
        super(height, weight, eyes, flyingHigh);
    }

    @Override
    public void iFly() {
        super.iFly();
    }

    @Override
    public String getInfo() {
        return "Аист: " + super.getInfo();
    }

    @Override
    public void makeASound() {
        System.out.println("Аист говорит");

    }

}
