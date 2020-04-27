package problem_1.solution.impl;

import problem_1.solution.Command;
import problem_1.solution.Lamp;

public class LampOffCommand implements Command {

    private Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOff();
    }
}
