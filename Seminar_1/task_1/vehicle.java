package Seminar_1.task_1;

/**
 * vehicle
 */
public class Vehicle {

    private String color;
    private String model;
    private Double weight;
    private Integer wheels;
    private Integer speed;

    public Object getField(Object obj) {
        return obj;
    }

    public Vehicle(String color, String model, Double weight, Integer wheels, Integer speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.wheels = wheels;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getWheels() {
        return wheels;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void ride(){
        System.out.printf("Я - %s, Я погнал", this.toString());
    }
    @Override
    public String toString() {

        return "model='"+ model + '\'' + ", color ='" + color + '\''+ ", wheels =" + wheels+
        ", weight =" + weight + ", speed = " + speed + '}';
    }
}