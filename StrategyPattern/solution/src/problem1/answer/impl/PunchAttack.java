package problem1.answer.impl;

import problem1.answer.Attackable;

public class PunchAttack implements Attackable {
    @Override
    public void attack() {
        System.out.println("I have a strong punch. Missile Fuck..");
    }
}
