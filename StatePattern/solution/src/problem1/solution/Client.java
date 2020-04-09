package problem1.solution;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();

        light.onButtonPush();
        light.onButtonPush();
        light.offButtonPush();
        light.offButtonPush();
    }
}
