package java2_hw1.obstracles;

import java2_hw1.movementable.Movementable;

public class Treadmill implements Obstracles{
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Movementable m) {
        m.run(dist);
    }

}
