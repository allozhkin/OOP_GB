package HW_02;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private List<Animal> array = new ArrayList<>();
    private Animal zoo;

    public void setZoo(Animal animal) {
        array.add(animal);
    }

    public void deletAnimal(int index) {
        array.remove(index);
    }

    public void getAnimal(int index) {
        Animal animal = array.get(index);
        System.out.println(animal.getClass().getSimpleName());
        if (animal instanceof Cat) {
            System.out.println(((Cat) animal).getInfo());
        }
        if (animal instanceof Chicken) {
            System.out.println(((Chicken) animal).getInfo());
        }
        if (animal instanceof Dog) {
            System.out.println(((Chicken) animal).getInfo());
        }
        if (animal instanceof Stork) {
            System.out.println(((Stork) animal).getInfo());
        }
        if (animal instanceof Wolf) {
            System.out.println(((Wolf) animal).getInfo());
        }
    }

    public void getSound(int index) {
        Animal animal = array.get(index);
        System.out.println(animal.getClass().getSimpleName());
        if (animal instanceof Sound) {
            ((Sound) animal).makeASound();
        }
    }

    public void allAnimals() {
        for (Animal animal : array) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.getInfo());
        }
    }

    public void getAllSound() {
        for (Animal animal : array) {
            System.out.println(animal.getClass().getSimpleName());
            if (animal instanceof Sound) {
                ((Sound) animal).makeASound();
            }
        }
    }

}
