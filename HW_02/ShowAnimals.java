package HW_02;

import java.util.Scanner;

public class ShowAnimals {
    public static void showAnimal(){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int index = in.nextInt();
        ZOO zoo = new ZOO();
        zoo.getAnimal(index);

    }

    public static void showAnimalAll(){

        
        ZOO zoo = new ZOO();
        zoo.allAnimals();

    }
}

