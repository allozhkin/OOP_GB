package HW_01;

public class Programm {
    public static void main(String[] args) {
        Product[] product = new Product[] {
                new Bread("Ржаной", 150, 2, "шт", "месяц",
                        "Высшего сорта"),
                new Children("Смесь", 2000, 1, "шт", 0,
                        "не гипоалергенн"),
                new Diapers("Pampers", 1500, 2, "шт",
                        2, "гипоалерген", 6, 10, 18,
                        "трусики"),
                new Drinks("Cola", 80, 10, "pc", 1),
                new Eggs("Лучшие", 150, 10, "шт", "месяц"),
                new Food("Колбаса", 3000, 1, "шт", "пол года"),
                new Hygiene("шампунь", 300, 1, "шт", 1),
                new Masks("Респираторы", 300, 5, "уп", 20),
                new Milk("Вкуснотеево", 170, 2, "шт",
                        2, 1.5, "2 месяца"),
                new Pacifier("Авент", 750, 1, "шт", 0, "гипоалерген"),
                new Product("чипсы", 320, 1, "шт")
        };
        products(product);

    }

    static void products(Product[] prod) {
        for (Product unit : prod){
            System.out.println(unit);
        }
    }
}
