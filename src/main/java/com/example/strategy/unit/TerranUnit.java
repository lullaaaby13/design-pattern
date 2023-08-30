package com.example.strategy.unit;

import com.example.strategy.attack.AttackBehavior;

public class TerranUnit {
    AttackBehavior attackBehavior;

    public TerranUnit(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void attack() {
        attackBehavior.attack();
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}
