package problem1.robot;

public class TaekwonV extends problem1.robot.Robot {

    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I hava Missile and can attack with it.");
    }

    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}
