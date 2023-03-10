package HW_02;

public class Cat extends Pet implements Sound {
    private String wool;

    public Cat(Integer height, Integer weight, String eyes, String name, String type, String inoculation, String color,
            String datoOfBirth, String wool) {
        super(height, weight, eyes, name, type, inoculation, color, datoOfBirth);
        this.wool = wool;
    }

    @Override
    public void makeASound() {
        System.out.println("мяу");
    }

    @Override
    public String getInfo() {
        String str = super.getInfo();
        return "Cat: " + str;

    }

    public void getWool() {
        System.out.println(this.wool = wool);
    }

}
