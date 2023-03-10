package HW_02;

import java.util.Scanner;

public class AddCat {
    public static void addCat() {

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
        System.out.print("Есть ли шерсть?: ");
        String Wool = in.nextLine();

        Cat cat1 = new Cat(growth, weight, eyeColor, nickname, breed, vaccinations, coatColor, birth, Wool);
        ZOO zoo = new ZOO();
        zoo.setZoo(cat1);
        System.out.println("Готово");

    }
}
