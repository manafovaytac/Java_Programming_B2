package day9__scanner;
import java.util.Scanner;
//  //import day04_variables.Store; // Just an example to show how to import class. not related to this task
//import java.util.Scanner;
///*
//create a class LeapYear
//create a main method
//create a Scanner object
//
//Ask the user to enter a year. Determine if the year is a leap year or not.
//You can assume a leap year is a year that is divisible by 4. Print true or false.
//
//Hint: use remainder operator
// */
public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a year: ");
        /*
        int year = input.nextInt();
        boolean isLeapYear = year % 4 == 0;
        System.out.println("It is a Leap Year: " + isLeapYear);
        */

        int year = input.nextInt();
        boolean isCovidYear = 2019 <= year && year < 2022;  // Hopefully not 2022 :)
        System.out.println(year + " was one of Covid years: " + isCovidYear);
    }
}
