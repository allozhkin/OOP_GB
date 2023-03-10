package HW_02;

import java.util.Scanner;

public class AddWolf {
    public static void addWolf(){

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
        System.out.print("Вожак?: ");
        String leader = in.nextLine();
        
        
        Wolf wolf = new Wolf(growth, weight, eyeColor, placeOf, dateOfLocation, leader);
        ZOO zoo = new ZOO();
        zoo.setZoo(wolf);
        System.out.println("Готово");

    }

}
