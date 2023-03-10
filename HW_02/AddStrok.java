package HW_02;

import java.util.Scanner;

public class AddStrok {
    public static void addStork(){

    
        System.out.print("Заполни эти пункты\nРост: ");
        Scanner in = new Scanner(System.in);
        Integer growth = in.nextInt();
        System.out.print("Вес: ");
        Integer weight = in.nextInt();
        System.out.print("Цвет глаз: ");
        String eyeColor = in.nextLine();
        System.out.println("Высота полета:");
        Integer fly = in.nextInt();
        
        
        Stork stork = new Stork(growth, weight, eyeColor, fly);
        ZOO zoo = new ZOO();
        zoo.setZoo(stork);
        System.out.println("Готово");

    }
}
