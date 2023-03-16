package Seminar_4;

public class Cat {
    private String name;
    private int height;
    
    public Cat(String name, int height){
        this.name = name;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "{\"name\": \"" + name + "\", \"height\": " + height + "}";
    }
}
