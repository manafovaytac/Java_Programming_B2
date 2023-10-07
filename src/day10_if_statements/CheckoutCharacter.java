package day10_if_statements;

public class CheckoutCharacter {
    /*
     create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
     find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

     ex:
         'b'
         lowercase

     ex:
         'U'
         uppercase
      */
    public static void main(String[] args) {
        char letter = '&';

        /*
            if UPPERCASE -- >  A <= letter <= Z  --- > A <= letter && letter <= Z
                print uppercase

            if lowercase --- > a <= letter <= z  --- > a <= letter && letter <= z
                print lowercase
         */
        if ('A' <= letter && letter <= 'Z') {
            System.out.println("UPPERCASE");
        }


        if ('a' <= letter && letter <= 'z') {
            System.out.println("lowercase");
        }

    }
}
