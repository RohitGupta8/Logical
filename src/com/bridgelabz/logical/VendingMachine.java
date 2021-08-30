package com.bridgelabz.logical;

import java.util.*;
import java.lang.*;

public class VendingMachine {

    public static void countCurrency(int amount) {
        int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] noteCounter = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        System.out.println("Rs : Number");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ------- Welcome To ATM -------");
        System.out.print("Enter Amount You want to withdraw Rs: ");
        int amount = sc.nextInt();
        countCurrency(amount);
    }
}
