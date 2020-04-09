package problem1.answer.impl;

import problem1.answer.MovingStrategy;

public class Flash implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("점멸은 D");
    }
}
