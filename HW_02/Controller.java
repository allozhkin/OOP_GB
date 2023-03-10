package HW_02;

import java.util.Scanner;
import static HW_02.AddAnimal.addAnimal;
import static HW_02.RemoveAnimal.removeAnimals;
import static HW_02.ShowAnimals.showAnimalAll;
import static HW_02.ShowAnimals.showAnimal;
import static HW_02.ShowSound.showSound;
import static HW_02.ShowSound.showSoundAll;


public class Controller {
    public static void go() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберете действие:\n1 - Добавить животное\n" +
                    "2 - Удалить животное\n" +
                    "3 - Инфориация о животном\n" +
                    "4 - Информация обо всех животных зоопарка\n" +
                    "5 - Издать звук животного\n" +
                    "6 - Издать звук всем животным\n" +
                    "7 - Выход");
            int choice = scanner.nextInt();
            if (choice == 1) {
                addAnimal(choice);
            }
            if (choice == 2) {
                removeAnimals();
            }
            if (choice == 3) {
                showAnimal();
            }
            if (choice == 4) {
                showAnimalAll();
            }
            if (choice == 5) {
                showSound();
            }
            if (choice == 6) {
                showSoundAll();
            }
            if (choice == 7) {
                break;
            }
            continue;
        }

        scanner.close();

    }
}
