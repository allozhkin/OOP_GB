package HW_02;

import java.util.Scanner;

public class AddTiger {
    public static void addTiger() {

        System.out.print("Заполни эти пункты\nРост: ");
        Scanner in = new Scanner(System.in);
        Integer growth = in.nextInt();
        System.out.print("Вес: ");
        Integer weight = in.nextInt();
        System.out.print("Цвет глаз: ");
        String eyeColor = in.nextLine();
        System.out.print("Где обитает: ");
        String placeOf = in.nextLine();
        System.out.print("Date of location: ");
        String dateOfLocation = in.nextLine();

        Tiger tiger = new Tiger(growth, weight, eyeColor, placeOf, dateOfLocation);
        ZOO zoo = new ZOO();
        zoo.setZoo(tiger);
        System.out.println("Готово");
    }
}
