package problem_1.solution;

import java.io.BufferedWriter;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
