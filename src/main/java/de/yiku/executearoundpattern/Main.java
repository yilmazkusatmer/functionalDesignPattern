package de.yiku.executearoundpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        FileProcessor processor = new FileProcessor(Main.class.getResource("/data.txt").getFile());

        String firstLine = processor.readLine(BufferedReader::readLine);
        logger.info(firstLine);

        String allLines = processor.readAllLines(BufferedReader::readLine);
        logger.info(allLines);
    }
}
