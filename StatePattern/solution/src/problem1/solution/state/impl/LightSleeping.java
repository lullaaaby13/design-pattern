package problem1.solution.state.impl;

import problem1.solution.Light;
import problem1.solution.state.LightState;

public class LightSleeping implements LightState {

    private static LightState state = new LightSleeping();

    public static LightState getInstance() {
        return state;
    }

    @Override
    public void onButton(Light light) {
        light.setState(LightSleeping.getInstance());
        System.out.println("Light is now normal mode.");
    }

    @Override
    public void offButton(Light light) {
        light.setState(LightOff.getInstance());
        System.out.println("Light turns off.");
    }
}
