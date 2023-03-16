package Seminar_4;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        int number =2;
        System.out.println(GetJson.returnJson(number));

        String someString = "Hello Bitch";
        System.out.println(GetJson.returnJson(someString));

        Cat cat = new Cat("Borya", 250);
        System.out.println(GetJson.returnJson(cat));
    }
}