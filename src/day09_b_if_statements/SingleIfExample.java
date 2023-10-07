package day09_b_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if(false) {
            // since out condition False, the body of the if statement (code block of if statement) is skipped
            System.out.println("Hello World!");
        }

        System.out.println("Second line");  // just a normal print statement which is NOT inside of IF statement


        if (true) {
            // Since the condition is true, the code inside of the if body, will be executed
            System.out.println("Today is Saturday");
        }


        int score = 60;
        if (score >= 75){  // false
            System.out.println("You passed the exam!");
        }

        if (score < 75) {  // true
            System.out.println("You failed!");
        }


        System.out.println();
        int year = 2023;
        boolean isLockdown = year == 2020 || year == 2021;

        if (isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study Java");
            System.out.println("When you study put your mask on");
        }

        // any single if statement does NOT depend on another statement
        if (!isLockdown) {
            System.out.println("Party");
            System.out.println("This is not a normal party. It is a Java Party");
            System.out.println("Travel");
        }
        // in the situation where the lockdown value is true | !true -> false

    }
}
