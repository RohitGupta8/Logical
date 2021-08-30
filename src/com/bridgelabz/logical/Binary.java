package com.bridgelabz.logical;

import java.util.Scanner;

public class Binary {
    public static void SwapNibbles ( int decToBinary ) {
        double result = (((decToBinary & 0x0F) << 4) | ((decToBinary & 0xF0) >> 4));
        System.out.println ( "Result of Swap Nibbles of binary number: " + result );
    }

    public static void main ( String[] args ) {
        int decimalNumber, r;
        int decToBinary;
        int resultOfSwapNibbles;
        String x = "";
        Scanner scanner = new Scanner ( System.in );
        System.out.print( "Enter a number: " );
        decimalNumber = scanner.nextInt ();
        decToBinary = decimalNumber;
        if (decimalNumber > 255) {
            System.out.println ( "Enter Number between 1 to 255" );
        } else {
            while (decimalNumber > 0) {
                r = decimalNumber % 2;
                x = r + "" + x;
                decimalNumber = decimalNumber / 2;
            }
            System.out.println ( "Binary is: " + x );
            SwapNibbles ( decToBinary );
        }
        scanner.close ();
    }
}
