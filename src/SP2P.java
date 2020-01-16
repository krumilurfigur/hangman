/*
Chooses single player or 2 player
2020-01-16
Gabriel Öberg
 */

import java.util.Scanner;

public class SP2P {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int player = 0;

        System.out.println("Are you playing 1 player or 2 player?");
        player = kb.nextInt();

    }
}