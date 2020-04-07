package problem1.answer.impl;

import problem1.answer.Movable;

public class Walk implements Movable {
    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}
