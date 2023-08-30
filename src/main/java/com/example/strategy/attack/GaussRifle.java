package com.example.strategy.attack;

public class GaussRifle implements AttackBehavior {
    private int damage = 6;
    @Override
    public void attack() {
        System.out.printf("GaussRifle [damage = %d]%n", damage);
    }
}
