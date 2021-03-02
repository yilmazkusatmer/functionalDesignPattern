package de.yiku.executearoundpattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    private final String filePath;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    public  String readAllLines(BufferedReaderProcessor bufferedReaderProcessor) throws IOException {
        if (bufferedReaderProcessor == null) {
            throw new IllegalArgumentException("Lambda cannot be null!");
        }
        return readLine(reader -> {
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            return builder.toString();
        });
    }

    public String readLine(BufferedReaderProcessor bufferedReaderProcessor) throws IOException {
        if (bufferedReaderProcessor == null) {
            throw new IllegalArgumentException("Lambda cannot be null!");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return bufferedReaderProcessor.processFile(reader);
        }
    }

}