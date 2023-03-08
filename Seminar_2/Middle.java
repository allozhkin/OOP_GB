package Seminar_2;

public class Middle extends Pupil implements Play, Smoke{

    @Override
    public void learning() {
        System.out.println("Я ненавижу учиться!!1");
    }
    @Override
    public void play(){
        System.out.println("Я играю в Minecraft");
    }
    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    }
}
