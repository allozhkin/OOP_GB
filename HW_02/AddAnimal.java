package HW_02;

import static HW_02.AddCat.addCat;
import static HW_02.AddChicken.addChicken;
import static HW_02.AddDog.addDog;
import static HW_02.AddStrok.addStork;
import static HW_02.AddTiger.addTiger;
import static HW_02.AddWolf.addWolf;
import java.util.Scanner;

public class AddAnimal {
    public static void addAnimal(int choice) {
        System.out.println("Какое животное добавить: \n1 - Кот\n2 - Курица\n" +
                "3 - Собака\n4 - Страус\n5 - тигр\n6 - Волк");
        Scanner in = new Scanner(System.in);
        int choice1 = in.nextInt();

        if (choice1 == 1) {
            addCat();
        }
        if (choice1 == 2) {
            addChicken();
        }
        if (choice1 == 3) {
            addDog();
        }
        if (choice1 == 4) {
            addStork();
        }
        if (choice1 == 5) {
            addTiger();
        }
        if (choice1 == 6) {
            addWolf();
        }

    }
}
