import attack.C10CanisterRifle;
import attack.FlameThrowers;
import attack.GaussRifle;
import unit.Firebat;
import unit.Ghost;
import unit.Marine;

public class Main {
    public static void main(String[] args) {

        Marine marine = new Marine(new GaussRifle());
        Firebat firebat = new Firebat(new FlameThrowers());
        Ghost ghost = new Ghost(new C10CanisterRifle());

        marine.attack();
        firebat.attack();
        ghost.attack();
    }
}
