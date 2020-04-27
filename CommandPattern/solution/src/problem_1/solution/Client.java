package problem_1.solution;

import problem_1.solution.impl.AlarmOnCommand;
import problem_1.solution.impl.LampOffCommand;
import problem_1.solution.impl.LampOnCommand;

public class Client {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);
        LampOffCommand lampOffCommand = new LampOffCommand(lamp);

        Alarm alarm = new Alarm();
        AlarmOnCommand alarmOnCommand = new AlarmOnCommand(alarm);

        Button button = new Button(lampOnCommand);
        button.press();

        button.setCommand(lampOffCommand);
        button.press();

        button.setCommand(alarmOnCommand);
        button.press();
    }
}
