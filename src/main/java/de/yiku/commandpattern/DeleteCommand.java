package de.yiku.commandpattern;

public class DeleteCommand implements Command {
    private final IODevice actionCommand;

    public DeleteCommand(IODevice actionCommand) {
        this.actionCommand = actionCommand;
    }

    @Override
    public void execute() {
        actionCommand.delete();
    }
}
