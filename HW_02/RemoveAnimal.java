package HW_02;

import java.util.Scanner;

public class RemoveAnimal {
    public static void removeAnimals(){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер: ");
        int index = in.nextInt();
        ZOO zoo = new ZOO();
        zoo.deletAnimal(index);

    }
}
