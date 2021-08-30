package com.bridgelabz.logical;

import java.util.*;

public class TemperatureConversion {
    public static void main ( String[] args ) {
        double fah, cel;
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Choose Type of conversion \n 1.Fahrenheit to Celsius \n 2. Celsius  to  Fahrenheit " );
        int ch = sc.nextInt ();
        switch (ch) {
            case 1 -> {
                System.out.print ( "Enter Fahrenheit temperature:  " );
                fah = sc.nextDouble ();
                double con = (fah - 32) * 5 / 9;
                System.out.println ( "Celsius temperature is: " + con );
            }
            case 2 -> {
                System.out.print ( "Enter Celsius temperature:  " );
                cel = sc.nextDouble ();
                double f = ((9 * cel) / 5) + 32;
                System.out.println ( "Fahrenheit temperature is: " + f );
            }
            default -> System.out.print ( "Please choose a valid input " );
        }

    }
}
