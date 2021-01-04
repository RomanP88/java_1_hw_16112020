package java2_hw1;

import java2_hw1.movementable.Cat;
import java2_hw1.movementable.Man;
import java2_hw1.movementable.Movementable;
import java2_hw1.movementable.Robot;
import java2_hw1.obstracles.Obstracles;
import java2_hw1.obstracles.Treadmill;
import java2_hw1.obstracles.Wall;

public class Main {
    public static void main(String[] args) {


        Movementable[] movementable = {
                new Cat(true),
                new Man(5, 360, "БОБ", true),
                new Robot(10, 1000, "ТЕРМИНАТОР", true)
        };


        Obstracles[] obstracles = {
                new Wall(5),
                new Treadmill(350),



        };


        for (Movementable movementables : movementable) {
            for (Obstracles obstracle : obstracles) {

                obstracle.doIt(movementables);
                if(!movementables.isDistance()) {
                    break;
                }
            }
        }

    }

}
