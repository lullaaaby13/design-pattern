package problem1.solution.state.impl;

import problem1.solution.Light;
import problem1.solution.state.LightState;

public class LightOn implements LightState {

    private static LightState state = new LightOn();

    private LightOn() {

    }

    public static LightState getInstance() {
        return state;
    }

    @Override
    public void onButton(Light light) {
        light.setState(LightSleeping.getInstance());
        System.out.println("Light is now sleeping mode.");
    }

    @Override
    public void offButton(Light light) {
        light.setState(LightOff.getInstance());
        System.out.println("Light turns off.");
    }
}
