package hw7;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Bars");
        Plate plate = new Plate(100);

        cat.eat(plate);

        plate.info();


        System.out.println(plate.decreaseFood(120));


        plate.addFood(10);


        Cat [] cats = {
                new Cat("Barsik"),
                new Cat("Tuzik"),
                new Cat("Busik"),
                new Cat("Murzik"),
        };



        Plate plates = new Plate(35);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plates);
        }
        for (Cat cat1 : cats) {
            System.out.println(cat1);

        }
        plates.info();

    }
}
