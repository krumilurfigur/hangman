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
        String word;
        double random;
        Scanner scan = null;
        try {
            scan = new Scanner(new File("words.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] words = new String[3846];

        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
        }
        random = (Math.random() * ((3846) + 1));
        random = Math.floor((random));
        word = words[(int) random];
        System.out.println(word);
    }
}