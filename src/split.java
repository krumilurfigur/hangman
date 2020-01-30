/*
Skapar en char array av ordet
2020-01-24
Gabriel Öberg
 */

import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        String word = "glad";
        char[] letters = word.toCharArray();

        System.out.println(letters[3]);
    }
}