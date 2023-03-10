package HW_02;

public class Dog extends Pet implements Sound {
    private String trained;

    public Dog(Integer height, Integer weight, String eyes, String name, String type, String inoculation, String color,
            String datoOfBirth, String trained) {
        super(height, weight, eyes, name, type, inoculation, color, datoOfBirth);
        this.trained = trained;
    }

    @Override
    public String getInfo() {
        return "Собака: " + super.getInfo();
    }

    public void getTrained() {
        System.out.println(this.trained = trained);
    }

    public void training() {
        System.out.println("train hard");
    }

    @Override
    public void makeASound() {
        System.out.println("ГАв гав");
    }

}
