package Seminar_1.task_1;

/**
 * programm
 */
public class Programm {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
            new Truck("deep green", "KAMAZ", 16.5, 10, 160),
            new Bicycle("Pink", "AIST", 10.5, 2, 20),
            new Moto("Orange", "YAMAHA", 80.3, 2, 220),
            new Car("Grey", "LADA", 20.5, 4, 160)
        };
        workVehicle(vehicles);

    }
    static void workVehicle(Vehicle[] vehicles){
        for (Vehicle vehicle : vehicles){
            System.out.printf("Model - %s\n", vehicle.getModel());
            System.out.printf("Color - %s\n", vehicle.getColor());
            System.out.printf("Wheels - %s\n", vehicle.getWheels());
            System.out.printf("Weight - %s\n", vehicle.getWeight());
            System.out.printf("Speed - %s\n", vehicle.getSpeed());
            vehicle.ride();
            System.out.println();
        }
    }
}