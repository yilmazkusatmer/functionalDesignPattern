package de.yiku.executearoundpattern;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
interface BufferedReaderProcessor {
    String processFile(BufferedReader reader) throws IOException;
}
