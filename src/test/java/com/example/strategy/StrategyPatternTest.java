package com.example.strategy;

import com.example.strategy.attack.C10CanisterRifle;
import com.example.strategy.attack.FlameThrowers;
import com.example.strategy.attack.GaussRifle;
import com.example.strategy.unit.Firebat;
import com.example.strategy.unit.Ghost;
import com.example.strategy.unit.Marine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StrategyPatternTest {

    @DisplayName("객체 생성 시, 전략을 선택하여 생성할 수 있다.")
    @Test
    void name() {
        Marine marine = new Marine(new GaussRifle());
        Firebat firebat = new Firebat(new FlameThrowers());
        Ghost ghost = new Ghost(new C10CanisterRifle());

        marine.attack();
        firebat.attack();
        ghost.attack();
    }

    @DisplayName("런타임에 동적으로 전략을 변경할 수 있다.")
    @Test
    void name2() {
        Marine marine = new Marine(new GaussRifle());

        marine.attack();

        marine.setAttackBehavior(new FlameThrowers());

        marine.attack();

    }
}
