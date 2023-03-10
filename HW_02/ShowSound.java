package HW_02;

import java.util.Scanner;

public class ShowSound {
    public static void showSound(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int index = in.nextInt();
        ZOO zoo = new ZOO();
        zoo.getSound(index);

    }

    public static void showSoundAll(){

        
        ZOO zoo = new ZOO();
        zoo.getAllSound();

    }

}
