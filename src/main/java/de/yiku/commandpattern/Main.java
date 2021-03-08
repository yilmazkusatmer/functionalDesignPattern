package de.yiku.commandpattern;

public class Main {
    public static void main(String[] args) {
        HardDisk hd = new HardDisk();
        CommandSequence sequence = new CommandSequence();
        sequence.addCommand(hd::copy);
        sequence.addCommand(hd::move);
        sequence.addCommand(hd::move);
        sequence.addCommand(hd::delete);
        sequence.runCommandSequence();
    }
}
