package problem1.solution.state;

import problem1.solution.Light;

public interface LightState {
    void onButton(Light light);
    void offButton(Light light);
}
