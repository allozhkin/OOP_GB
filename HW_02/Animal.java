package HW_02;

public abstract class Animal {
    private Integer height;
    private Integer weight;
    private String eyes;

    public Animal(Integer height, Integer weight, String eyes) {
        this.height = height;
        this.weight = weight;
        this.eyes = eyes;
    }

    public String getInfo() {
        return String.format("Вес: %d\nРост: %d\nЦвет глаз: %s", weight, height, eyes);
    }

}
