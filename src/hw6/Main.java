package hw6;

import hw6.animals.Cat;
import hw6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 200,0);
        cat.runAway(300);
        cat.sail(10);

        System.out.println();

        Dog dog = new Dog("Рэкс", 500, 10);
        dog.runAway(300);
        dog.sail(10);
    }
}
