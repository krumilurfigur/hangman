/*
gissa bokstav eller ord
2020-01-23
Gabriel Öberg
 */

import java.util.Scanner;

public class Gissa {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int gissa = 1;
        String gissning;

        System.out.println("skriv 1 för att gissa bokstav eller 2 för att gissa ett ord");
        gissa = kb.nextInt();

        if (gissa == 1){
        System.out.println("gissa en bokstav");
        gissning = kb.nextLine();

        }
        else{
        System.out.println("gissa ett ord");
        gissning = kb.nextLine();

            if (gissning == word){
             System.out.println("du hade rätt!");
            }
            else {
                System.out.println("du hade fel!");
                //+ gubbe
            }
        }
}