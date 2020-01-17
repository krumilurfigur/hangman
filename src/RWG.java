/*
generates a random word
2020-01-16
Gabriel Öberg
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RWG {
    public static void main(String[] args) {
        Scanner scan = new Scanner("words.txt");
        String[] words = new String[3847];

        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
            System.out.println(words[i]);
        }
    }
}