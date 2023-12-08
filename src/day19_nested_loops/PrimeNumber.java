package day19_nested_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // What is the number is Prime
        // Prime number is the number that is divisible by 1 and itself
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a PRIME number: ");
        int num = input.nextInt();
        int count = 0;

        for (int i = 1; i <= num ; i++) {

            if (num % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("NOT Prime number");
        }


    }
}
