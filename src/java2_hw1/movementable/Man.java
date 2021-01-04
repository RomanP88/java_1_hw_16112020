package java2_hw1.movementable;

public class Man implements Movementable{
    private int maxJump;
    private  int maxRun;
    private String name;
    private boolean isDistance;


    public Man(int maxJump, int maxRun, String name, boolean isDistance) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.name = name;
        this.isDistance = isDistance;

    }

    @Override
    public void jump(int height) {
        if (height > maxJump) {
            System.out.println(name + " не смог прыгнуть " + height + " м");
            isDistance = false;
        } else {
            System.out.println(name + " смог прыгнуть на нужную высоту " + height + " м");

        }
    }
    @Override
    public void run ( int dist){
        if (dist > maxRun) {
            System.out.println(name + " не смог пробежать " + dist + " м");
            isDistance = false;
        } else {
            System.out.println(name + " сумел пробежать " + dist + " м");
        }
    }

    @Override
    public boolean isDistance() {
        return isDistance;
    }
}
