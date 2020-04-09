package problem1.answer.impl;

import problem1.answer.AttackStrategy;

public class MissileAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("미사일 공격!");
    }
}
