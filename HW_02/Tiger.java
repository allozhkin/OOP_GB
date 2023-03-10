package HW_02;

public class Tiger extends WildAnimal implements Sound {

    public Tiger(Integer height, Integer weight, String eyes, String dateOfBeen, String placeOf) {
        super(height, weight, eyes, dateOfBeen, placeOf);
    }

    @Override
    public void makeASound() {
        System.out.println("rrrrrrrr");
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}
