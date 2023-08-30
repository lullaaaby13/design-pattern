package attack;

public class C10CanisterRifle implements AttackBehavior {
    private int damage = 10;
    @Override
    public void attack() {
        System.out.printf("C10CanisterRifle [damage = %d]%n", damage);
    }
}
