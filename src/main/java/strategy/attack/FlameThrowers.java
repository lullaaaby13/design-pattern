package attack;

public class FlameThrowers implements AttackBehavior{

    private int damage = 16;
    @Override
    public void attack() {
        System.out.printf("FlameThrowers [damage = %d]%n", damage);
    }

}
