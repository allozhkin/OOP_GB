package Seminar_2;

public class Programm {
    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[3];
        Pupil jun = new Junior();
        Pupil mid = new Middle();
        Pupil sen = new Senior();

        pupils[0] = jun;
        pupils[1] = mid;
        pupils[2] = sen;

        getInfo(pupils);
    }

    public static void getInfo(Pupil[] pupiles) {
        for (Pupil pupil : pupiles) {
            System.out.println(pupil.getClass().getSimpleName());
            pupil.learning();
            if (pupil instanceof Play) {
                ((Play) pupil).play();
            }
            if (pupil instanceof Smoke) {
                ((Smoke) pupil).smoke();
            }
            if (pupil instanceof GoExtention) {
                ((GoExtention) pupil).goExtention();
            }
            if (pupil instanceof Love) {
                ((Love) pupil).love();
            }
            System.out.println();
        }
    }

}
