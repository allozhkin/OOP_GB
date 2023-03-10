package HW_02;

public abstract class WildAnimal extends Animal {
    private String placeOf;
    private String dateOfBeen;

    public WildAnimal(Integer height, Integer weight, String eyes, String dateOfBeen, String placeOf) {
        super(height, weight, eyes);
        this.placeOf = placeOf;
        this.dateOfBeen = dateOfBeen;
    }

    @Override
    public String getInfo() {
        String str = super.getInfo();
        return str + String.format("Место обитания: %s\n" +
                "Дата обитания: %s", placeOf, dateOfBeen);
    }

}
