package com.bridgelabz.logical;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main ( String[] args ) {
        double payment, r;
        int n;
        int principalLoanAmount, year = 0;
        double rOI = 0, amountToPayForMonth;
        Scanner scanner = new Scanner ( System.in );
        System.out.print( "Enter Principal Loan Amount: Rs." );
        principalLoanAmount = scanner.nextInt ();
        System.out.print( "Enter Year: " );
        year = scanner.nextInt ();
        System.out.print( "Enter Rate Of Interest: " );
        rOI = scanner.nextDouble ();
        r = (rOI / (12 * 100));
        n= 12*year;
        payment = (principalLoanAmount * r) / (1 - Math.pow ( 1 + r, -n ));

        System.out.println ( "Amount to Pay :" + payment + " For Year :" + year );
        scanner.close ();
    }

}
