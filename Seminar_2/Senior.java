package Seminar_2;

/**
 * Senior
 */
public class Senior extends Pupil implements Smoke, Love{

    @Override
    public void learning() {
        System.out.println("Я должен учиться!");
    }


    public void love() {
        System.out.println(" Я ищу любовь");
    }

    @Override
    public void smoke() {
        System.out.println(" Я бросаю курить");
    }

    
}