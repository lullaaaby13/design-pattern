package problem1.answer.impl;

import problem1.answer.Attackable;

public class MissileAttack implements Attackable {
    @Override
    public void attack() {
        System.out.println("I have a strong missile and am able to attack with it.");
    }
}
