package hw7;

public class Cat {
    private String name;
    private int appetite = 10;
    private boolean satiety;

    public Cat(String name) {

        this.name = name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {

        return name;
    }


    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite)){
            System.out.println("cat " + name + "  eat...");
            satiety = true;
        } else {
            System.out.println("cat " + name + " not eat...");

        }


    }

    @Override
    public String toString() {
        return String.format("%s %d %s", name, appetite, satiety);
    }
}

