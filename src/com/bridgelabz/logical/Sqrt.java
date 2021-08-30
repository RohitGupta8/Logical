package com.bridgelabz.logical;

import java.util.*;

public class Sqrt {
    public static void findSquareRootUsingNewtonsMethod ( int c ) {
        double t, epsilon;
        t = c;

        epsilon = 1e-15;

        while (Math.abs ( t - c / t ) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println ( "Square Root of " + c + " using Newtons Law is " + t );
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int c;
        double result;
        System.out.print ( "Enter NonNegative value: " );
        c = scanner.nextInt ();
        if (c > 0) {
            findSquareRootUsingNewtonsMethod ( c );

        } else {
            System.out.println ( "Please enter positive value.." );
        }

        scanner.close ();
    }

}

