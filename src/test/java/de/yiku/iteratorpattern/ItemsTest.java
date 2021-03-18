package de.yiku.iteratorpattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemsTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void iterateOverItemsAndPrintln() {
        // given
        Items<String> testItems = new Items<>(List.of("ipad", "iphone", "macbook"));
        String displayItems = "ipad\niphone\nmacbook\n";

        // when
        testItems.forEach(System.out::println);

        // then
        assertThat(outputStreamCaptor.toString()).hasToString(displayItems);
    }

    @Test
    void iterateOverItemsAndUppercasePrintln() {
        // given
        Items<String> testItems = new Items<>(List.of("ipad", "iphone", "macbook"));
        String displayItems = "IPAD\nIPHONE\nMACBOOK\n";

        // when
        testItems.forEach(item -> System.out.println(item.toUpperCase()));

        // then
        assertThat(outputStreamCaptor.toString()).hasToString(displayItems);
    }

    @Test
    void iterateOverNumbersAndPrintln() {
        // given
        Items<Integer> testNumbers = new Items<>(List.of(1, 2, 3));
        String displayNumbers = "1\n2\n3\n";

        // when
        testNumbers.forEach(System.out::println);

        // then
        assertThat(outputStreamCaptor.toString()).hasToString(displayNumbers);
    }
}