package de.yiku.fluentinterfacepattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class FluentRandomTest {
    private final FluentRandom rd = spy(FluentRandom.class);

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
    void threeRandomNumbersBetween1And5() {
        // given
        rd.lowest(1).highest(5).quantity(3);
        when(rd.nextInt()).thenReturn(1, 2, 3, 4, 5);

        // when
        List<Integer> randomNumbers = rd.randomNumbers();

        //then
        assertThat(randomNumbers).hasSize(3).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    void twoRandomNumbersBetween1And3andPrintln() {
        // given
        rd.lowest(1).highest(3).quantity(2);
        String givenRandomNumberText = "Test random: 3\nTest random: 1\n";
        when(rd.nextInt()).thenReturn(3, 1);

        // when
        rd.println(random -> System.out.println("Test random: " + random));

        //then
        assertThat(outputStreamCaptor.toString()).hasToString(givenRandomNumberText);
    }
}