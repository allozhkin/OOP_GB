package HW_02;

import java.util.Scanner;

public class AddDog {

    public static void addDog() {

        System.out.print("Заполни эти пункты\nРост: ");
        Scanner in = new Scanner(System.in);
        Integer growth = in.nextInt();
        System.out.print("Вес: ");
        Integer weight = in.nextInt();
        System.out.print("Цвет глаз: ");
        String eyeColor = in.nextLine();
        System.out.print("Кличка: ");
        String nickname = in.nextLine();
        System.out.print("Порода: ");
        String breed = in.nextLine();
        System.out.print("Прививки: ");
        String vaccinations = in.nextLine();
        System.out.print("Цвет: ");
        String coatColor = in.nextLine();
        System.out.print("Дата рождения: ");
        String birth = in.nextLine();
        System.out.print("Дресировка: ");
        String trained = in.nextLine();

        Dog dog1 = new Dog(growth, weight, eyeColor, nickname, breed,
                vaccinations, coatColor, birth, trained);
        ZOO zoo = new ZOO();
        zoo.setZoo(dog1);
        System.out.println("Готово");

    }
}
