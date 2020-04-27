package problem_1.solution.impl;

import problem_1.solution.Alarm;
import problem_1.solution.Command;

public class AlarmOnCommand implements Command {

    private Alarm alarm;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        this.alarm.start();
    }
}
