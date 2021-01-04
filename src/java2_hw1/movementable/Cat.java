package java2_hw1.movementable;

public class Cat implements Movementable{
    private final int MAX_JUMP = 100 ;

    private final int MAX_RUN = 7;

    private final String NAME = "БАРСИК";



    private boolean isDistance;

    public Cat(boolean isDistance) {
        this.isDistance = isDistance;
    }



    @Override
    public void jump(int height) {
        if(height > MAX_JUMP){
            System.out.println(NAME + " не смог прыгнуть " + height + " м");
            isDistance = false;
        } else {
            System.out.println(NAME + " смог прыгнуть на нужную высоту " + height + " м");
        }


    }

    @Override
    public void run(int dist) {
        if(dist > MAX_RUN){
            System.out.println(NAME + " не смог пробежать " + dist + " м");
            isDistance = false;
        } else {
            System.out.println(NAME + " сумел пробежать " + dist + " м");
        }


    }

    @Override
    public boolean isDistance() {
        return isDistance;
    }
}
