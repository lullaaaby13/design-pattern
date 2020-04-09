package problem1;

public class Light {
    private LightState state;

    public Light() {
        state = LightState.OFF;
    }

    public void offButtonPush() {
        if (state.equals(LightState.OFF)) {
            System.out.println("NO ACTIONS..");
        } else if (state.equals(LightState.ON)) {
            System.out.println("LIGHT OFF");
            state = LightState.OFF;
        } else {
            System.out.println("LIGHT OFF");
            state = LightState.OFF;
        }
    }

    public void onButtonPush() {
        if (state.equals(LightState.OFF)) {
            System.out.println("LIGHT ON");
            state = LightState.ON;
        } else if (state.equals(LightState.ON)) {
            System.out.println("NO ACTIONS..");
        } else {
            System.out.println("LIGHT ON");
            state = LightState.ON;
        }
    }
}
