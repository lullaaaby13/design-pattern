package problem1.answer;

import java.util.Optional;

public abstract class Robot {

    private String name;
    private Attackable attackable;
    private Movable movable;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        Optional.ofNullable(attackable).ifPresent(Attackable::attack);
    }

    public  void move() {
        Optional.ofNullable(movable).ifPresent(Movable::move);
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }
}
