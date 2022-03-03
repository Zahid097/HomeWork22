package com.company;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("Alphabet.txt");
        FileWriter writer = new FileWriter(file);
        String abc1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abc2 = abc1.toLowerCase(Locale.ROOT);
        String abc3 = "0123456789";
        for (int i = 0; i < abc1.length(); i++) {
            writer.write(abc1.charAt(i) + " " + abc2.charAt(i) + "\n");
        }
        for (int i = 0; i < abc3.length(); i++) {
            writer.write(abc3.charAt(i) + "\n");
        }
        writer.close();

        try (FileReader fileReader = new FileReader(file)) {
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;
            while (scanner.hasNextLine()) {
                counter++;
                if (counter < 10) {
                    System.out.println(counter + ":   " + scanner.nextLine());
                } else {
                    System.out.println(counter + ":  " + scanner.nextLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
