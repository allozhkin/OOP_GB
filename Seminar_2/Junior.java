package Seminar_2;

public class Junior extends Pupil implements Play, GoExtention {

    @Override
    public void learning() {
        System.out.println("Я хочу учиться!!!");
    }

    @Override
    public void goExtention() {
        System.out.println("Я хожу на продленку");
    }

    @Override
    public void play() {
        System.out.println("Я играю в игрушки");
    }

}
