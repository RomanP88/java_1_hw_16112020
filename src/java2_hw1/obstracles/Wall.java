package java2_hw1.obstracles;

import java2_hw1.movementable.Movementable;

public class Wall implements Obstracles {

    private int height;

    public Wall(int height) {

        this.height = height;
    }

    @Override
    public void doIt(Movementable m) {

        m.jump(height);
    }
}
