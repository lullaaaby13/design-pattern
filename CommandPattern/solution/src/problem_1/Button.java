package problem_1;

public class Button {

    private Lamp lamp;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public void press() {
        lamp.turnOn();
    }

}
