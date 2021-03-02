package de.yiku.executearoundpattern;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class FileProcessorTest {

    @Test
    void readFirstLine() throws IOException {
        // given
        FileProcessor processor = new FileProcessor(FileProcessorTest.class.getResource("/test.txt").getFile());

        // when
        String firstLine = processor.readLine(BufferedReader::readLine);

        // then
        assertThat(firstLine).isEqualTo("Java is cool.");
    }

    @Test
    void readAllLines() throws IOException {
        // given
        FileProcessor processor = new FileProcessor(FileProcessorTest.class.getResource("/test.txt").getFile());

        // when
        String firstLine = processor.readAllLines(BufferedReader::readLine);

        // then
        assertThat(firstLine).isEqualTo("Java is cool.\nThis is a test file.\n");
    }

}