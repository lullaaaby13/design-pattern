package unit;

import attack.AttackBehavior;

public class TerranUnit {
    AttackBehavior attackBehavior;

    public TerranUnit(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void attack() {
        attackBehavior.attack();
    }

}
