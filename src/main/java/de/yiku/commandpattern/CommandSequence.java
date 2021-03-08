package de.yiku.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class CommandSequence {
    private List<Command> commands;

    public CommandSequence() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }

    public void clearSequence() {
        commands.clear();
    }

    public void runCommandSequence() {
        commands.forEach(Command::execute);
    }
}
