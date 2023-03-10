package HW_02;

public abstract class Pet extends Animal {
    private String name;
    private String type;
    private String inoculation;
    private String color;
    private String datoOfBirth;

    public Pet(Integer height, Integer weight, String eyes, String name, String type,
            String inoculation, String color, String datoOfBirth) {
        super(height, weight, eyes);
        this.name = name;
        this.type = type;
        this.inoculation = inoculation;
        this.color = color;
        this.datoOfBirth = datoOfBirth;
    }

    public void soft() {
        System.out.println("Проявляю ласку");
    }

    @Override
    public String getInfo() {
        String str = super.getInfo();
        return str + String.format(" Кличка: %s\nПарода: %s\nПрививки: %s\n" +
                "Цвет шерсти: %s\nДата Рождеия: %s", name, type, inoculation, color, datoOfBirth);

    }

}
