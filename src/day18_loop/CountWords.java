package day18_loop;
import java.util.Scanner;

/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userSentence = input.nextLine().trim();

        // This has multiple    words
        // 01234567890.......
        /*
            count words
                - count spaces + 1

            count space?
                loop through all character and see how many there

         */
        int countEmpty = 0;
        for (int i = 0; i < userSentence.length() ; i++) {
            // if character is equal to  " ", want to increase my count
            if (userSentence.charAt(i) == ' '){
                countEmpty++;
            }
        }
        System.out.println("The number of empty spaces: " + countEmpty);
        System.out.println("You have " + (countEmpty+1) + " words.");



    }
}
