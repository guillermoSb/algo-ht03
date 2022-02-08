package com.ht03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    /**
     * Read a file containing numbers
     * @return
     */
    public ArrayList<Integer> readFile(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Array of numbers to return
        // Attempt to read the file
        try {
            File numbersFile = new File(fileName);
            Scanner scanner = new Scanner(numbersFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (data.length() > 0) {
                    numbers.add(Integer.parseInt(data));
                }
            }
            scanner.close();
            return numbers;
        } catch (Exception e) {
            return new ArrayList<>();   // Return an empty array list if there are errors
        }
    }

    /**
     * Save an array list of numbers to a file
     * @param numbersToSave
     */
    public void saveNumbersToFile(ArrayList<Integer> numbersToSave, String fileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder("");    // Builder to create the final string
        String fileContent = "";    // String to be saved
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        // Append the items to the string
        for (int number: numbersToSave) {
            stringBuilder.append(String.format("%d", number)).append("\n");
        }
        fileContent = stringBuilder.toString();
        if (fileContent.length() > 0) {
            fileContent = fileContent.substring(0, fileContent.length() -1);
        }
        writer.write(fileContent);  // Write the content to the file
        writer.close();

    }


}
