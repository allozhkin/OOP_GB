package HW_02;

import java.util.Scanner;

public class AddChicken {
    public static void addChicken() {
        System.out.print("Заполни эти пункты\nРост: ");
        Scanner in = new Scanner(System.in);
        Integer growth = in.nextInt();
        System.out.print("Вес: ");
        Integer weight = in.nextInt();
        System.out.print("Цвет глаз: ");
        String eyeColor = in.nextLine();
        System.out.print("Высота полета: ");
        Integer fly = in.nextInt();

        Chicken chicken = new Chicken(growth, weight, eyeColor, fly);
        ZOO zoo = new ZOO();
        zoo.setZoo(chicken);
        System.out.println("Готово");

    }

}
