package day19_nested_loops;

import java.util.Scanner;

public class Html {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input in the required format: ");
        String userInput = input.next();
        String firstPart = userInput.substring(0, userInput.indexOf("^"));
        String secondPart = userInput.substring(userInput.indexOf("^") + 1);
        int num = Integer.parseInt(secondPart);

        for (int i = 0; i < num; i++) {
            System.out.print("<" + firstPart + "></" + firstPart + ">");
        }
    }
}
