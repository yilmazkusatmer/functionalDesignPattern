package de.yiku.commandpattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class CommandSequenceTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @AfterAll
    public static void tearDown() {
        System.setOut(System.out);
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void movingAndDeletingAndCopyingCommand() {
        // given
        HardDisk hd = new HardDisk();
        CommandSequence sequence = new CommandSequence();
        sequence.addCommand(hd::move);
        sequence.addCommand(hd::delete);
        sequence.addCommand(hd::copy);
        String displayCommands = "Moving...\nDeleting...\nCopying...\n";
        // when
        sequence.runCommandSequence();

        // then
        assertThat(displayCommands).isEqualTo(outputStreamCaptor.toString());
    }
}