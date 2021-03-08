package de.yiku.commandpattern;

public class CopyCommand implements Command {
    private final IODevice actionCommand;

    public CopyCommand(IODevice actionCommand) {
        this.actionCommand = actionCommand;
    }

    @Override
    public void execute() {
        actionCommand.copy();
    }
}
