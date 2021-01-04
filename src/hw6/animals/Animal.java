package hw6.animals;

public class Animal {
    String name;
    int runLength;
    int sailLength;

    public Animal(String name, int runLength, int sailLength) {
        this.name = name;
        this.runLength = runLength;
        this.sailLength = sailLength;
    }

    public void runAway(int distance) {
        if (distance < runLength) {
            System.out.println(name + " успешно пробежала крос расстоянием 300 м");
        } else {
            System.out.println("Такую дистанция " + name + " не сможет пробежать");
        }

        System.out.println("Максимальное расстояние, которое сможет преодолеть " + name + " состовляет " + runLength + " метров");


    }


    public void sail(int distance) {
        if (distance <= sailLength) {
            System.out.println(name + " успешно проплыл заплыв дистанцией в 10 м ");
        } else {
            System.out.println(name + " не умеет плавать");
        }

    }
}
