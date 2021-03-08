package de.yiku.commandpattern;

public class MoveCommand implements Command {
    private final IODevice actionCommand;

    public MoveCommand(IODevice actionCommand) {
        this.actionCommand = actionCommand;
    }

    @Override
    public void execute() {
        actionCommand.move();
    }
}
