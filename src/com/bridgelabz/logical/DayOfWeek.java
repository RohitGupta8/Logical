package com.bridgelabz.logical;

import java.util.Scanner;

public class DayOfWeek {

    int year;        //1+
    int month;        //1-12
    int date;        //1-31B
    String fullDate;//DD/MM/YYYY
    int dayOfWeek;    //0-6

    int doomsday0000 = 1;


    public static void main ( String[] args ) {
        DayOfWeek dc = new DayOfWeek ();
        dc.beginCalculator ();

    }

    public void beginCalculator () {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Welcome to the Doomsday Calculator!" );
        getYear ( scanner );
        getMonth ( scanner );
        getDate ( scanner );
        calculateDayOfWeek ();
        this.fullDate = this.date + "/" + this.month + "/" + this.year;
        System.out.println ( "You have entered the date: " + this.fullDate );
        System.out.println ( this.fullDate + " is a " + numberToDay ( this.dayOfWeek ) );
    }

    public void getYear ( Scanner scanner ) {
        System.out.println ( "Please enter a year (1+): " );
        int inputYear;
        while (!scanner.hasNext ( "[1-9][0-9]*" )) {
            System.out.println ( "Invalid year (1+)." );
            scanner.next ();
        }
        inputYear = scanner.nextInt ();
        this.year = inputYear;
    }

    public void getMonth ( Scanner scanner ) {
        System.out.println ( "Please enter a month (1-12): " );
        int inputMonth;
        while (!scanner.hasNext ( "[1-9]|1[012]" )) {
            System.out.println ( "Invalid month (1-12)." );
            scanner.next ();
        }
        inputMonth = scanner.nextInt ();
        this.month = inputMonth;
    }

    public void getDate ( Scanner scanner ) {
        System.out.println ( "Please enter a date (1-31): " );
        int inputDate;
        while (!scanner.hasNext ( "[1-9]|[12][0-9]|[3][01]" )) {
            System.out.println ( "Invalid date (1-31)." );
            scanner.next ();
        }
        inputDate = scanner.nextInt ();
        this.date = inputDate;
    }

    public void calculateDayOfWeek () {
        //Anchor calculation
        int yearCentury = (int) Math.floor ( this.year / 100 );
        boolean isLeapCentury = (yearCentury % 4) == 0;

        //Calculate simple anchor doomsday
        int anchorDoomsday = Math.abs ( doomsday0000 + (yearCentury * 2) + 2 );
        if (isLeapCentury) {
            anchorDoomsday += 1;
        }
        anchorDoomsday = anchorDoomsday % 7;

        //Year calculation
        int yearSinceCentury = this.year - (yearCentury * 100);
        boolean isLeapYear = (yearSinceCentury % 4) == 0;
        int yearDoomsday = (int) (anchorDoomsday + yearSinceCentury + Math.floor ( yearSinceCentury / 4 ));

        //Month calculation
        int monthDoomsday = 0;
        switch (this.month) {
            case 1:    //January
                if (isLeapYear) {
                    monthDoomsday = 32;
                } else {
                    monthDoomsday = 31;
                }
                break;
            case 2:    //February
                if (isLeapYear) {
                    monthDoomsday = 29;
                } else {
                    monthDoomsday = 28;
                }
                break;
            case 3:    //March
                monthDoomsday = 7;
                break;
            case 4:        //April
                monthDoomsday = 4;
                break;
            case 5:    //May
                monthDoomsday = 9;
                break;
            case 6:    //June
                monthDoomsday = 6;
                break;
            case 7:    //July
                monthDoomsday = 11;
                break;
            case 8:    //August
                monthDoomsday = 8;
                break;
            case 9:    //September
                monthDoomsday = 5;
                break;
            case 10:    //October
                monthDoomsday = 10;
                break;
            case 11:    //November
                monthDoomsday = 7;
                break;
            case 12:    //December
                monthDoomsday = 12;
                break;
            default:
                System.out.println ( "An error occurred." );
                break;
        }

        //Date calculation
        int dateDifference = this.date - monthDoomsday;
        int dateDoomsday = yearDoomsday + dateDifference;
        while (dateDoomsday < 0) {
            dateDoomsday += 7;
        }
        dateDoomsday = dateDoomsday % 7;

        this.dayOfWeek = dateDoomsday;
    }

    public String numberToDay ( int numday ) {
        switch (numday) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "invalid number";
        }
    }
}
