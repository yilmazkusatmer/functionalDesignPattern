package de.yiku.iteratorpattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemsTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void iterateOverItemsAndPrintln() {
        // given
        Items<String> testItems = new Items<>(List.of("ipad", "iphone", "macbook"));

        // when
        testItems.forEach(System.out::println);

        // then
        assertThat("ipad\niphone\nmacbook\n").isEqualTo(outputStreamCaptor.toString());
    }

    @Test
    public void iterateOverItemsAndUppercasePrintln() {
        // given
        Items<String> testItems = new Items<>(List.of("ipad", "iphone", "macbook"));

        // when
        testItems.forEach(item -> System.out.println(item.toUpperCase()));

        // then
        assertThat("IPAD\nIPHONE\nMACBOOK\n").isEqualTo(outputStreamCaptor.toString());
    }

    @Test
    public void iterateOverNumbersAndPrintln() {
        // given
        Items<Integer> testNumbers = new Items<>(List.of(1, 2, 3));

        // when
        testNumbers.forEach(System.out::println);

        // then
        assertThat("1\n2\n3\n").isEqualTo(outputStreamCaptor.toString());
    }
}