package problem1.solution;

import problem1.solution.state.LightState;
import problem1.solution.state.impl.LightOff;

public class Light {

    private LightState state;

    public Light() {
        this.state = LightOff.getInstance();
    }

    public void setState(LightState state) {
        this.state = state;
    }

    public void onButtonPush() {
        state.onButton(this);
    }

    public void offButtonPush() {
        state.offButton(this);
    }

}
