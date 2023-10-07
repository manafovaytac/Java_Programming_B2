package day14_string;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // input is the object name   |  new Scanner(System.in); ----- > this is the actual object in memory.
        System.out.print("Enter your username: ");
        String username = input.next();
        username = username.toLowerCase(); // I made my username to lowercase

        System.out.print("Enter your password: ");
        String password = input.next();

        String actualPasswordInDB = "loopcamp2023";

        /*
            if condition - length bigger than 8 and password match
                    -------------
            else
                    ------------
         */


        System.out.println();
        if (username.equals( "java") && password.length() > 8 &&  password.equals( actualPasswordInDB )) {
            System.out.println("You are logged in.");
        } else {
            if (!username.equals("java")){
                System.out.println("Username is invalid");
            } else {
                System.out.println("Invalid password!");
            }
        }

    }
}
