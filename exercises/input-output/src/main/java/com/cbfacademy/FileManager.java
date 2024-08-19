package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Collections;

public class FileManager {

    // Method to read a file and return its contents as a List of Strings.
    public List<String> readFile(String filename) throws IOException {
        // Read all lines from the file into a list and return it.
        return Files.readAllLines(Paths.get(filename));
    }

    // Method to copy contents from one file to another.
    public void copy(String inputFile, String outputFile) {
        try {
            // Copy the contents of the input file to the output file.
            Files.copy(Paths.get(inputFile), Paths.get(outputFile), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace(); // Print any IO exceptions that occur.
        }
    }

    // Method to reverse the lines of the inputFile and write them to outputFile.
    public void reverseLines(String inputFile, String outputFile) {
        try {
            // Read all lines from the input file into a list.
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            // Reverse the order of lines.
            Collections.reverse(lines);

            // Write the reversed lines to the output file.
            Files.write(Paths.get(outputFile), lines);
        } catch (IOException e) {
            e.printStackTrace(); // Print any IO exceptions that occur.
        }
    }
}