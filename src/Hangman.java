/*
A program that plays hangman
2020-01-24
Gabriel Öberg
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

    }

    /*
Chooses single player or 2 player
2020-01-16
Gabriel Öberg
 */
    public static void SP2P() {
        Scanner kb = new Scanner(System.in);
        int player = 0;

        System.out.println("Are you playing 1 player or 2 players?");
        player = kb.nextInt();
    }

    /*
    generates a random word
    2020-01-16
    Gabriel Öberg
     */
    public static void RWG() {
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
    }

    /*
gör så att man kan välja ord i 2 spelare
2020-01-23
Gabriel Öberg
 */
    public static void VO(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("write your word");
        String word = kb.nextLine();
    }

    /*
Skapar en char array av ordet
2020-01-24
Gabriel Öberg
 */
    public static void split(String[] args) {
        char[] letters = word.toCharArray();
    }

    /*
gissa bokstav eller ord
2020-01-23
Gabriel Öberg
 */
    public static void Gissa(String[] args) {
        Scanner kb = new Scanner(System.in);
        int mode = 1;
        String guess;
        String word = "glad";
        char[] letters = word.toCharArray();


        System.out.println("skriv 1 för att gissa bokstav eller 2 för att gissa ett ord");
        mode = kb.nextInt();

        if (mode == 1) {
            System.out.println("gissa en bokstav");
            guess = kb.nextLine();
            if (word.indexOf(guess) >= 0){

            }
        }
        else {
            System.out.println("gissa ett ord");
            guess = kb.nextLine();

            if (guess == word) {
                System.out.println("du hade rätt, du vinner!");

            }
            else {
                System.out.println("du hade fel!");
                //+ gubbe
            }
        }
    }
}