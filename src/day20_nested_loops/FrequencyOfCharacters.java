package day20_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "doublee";
        //            012345 --- > str.length(); => 6
        String unique = "";



        /*
            take each character and start from beginning to compare
                If it is same - increase the count
         */

        // Outer loop
        for (int i = 0; i < str.length(); i++) {                // i = 0 -- > | i = 1
            int count = 0; // The reason I initialize counter here is because on each outer loop cycle, I want to set back to 0

            char eachLetter = str.charAt(i);                    // eachLetter = 'd'; | eachLetter = 'o'

            if (!unique.contains("" + eachLetter)){

                // Inner loop
                for (int j = 0; j < str.length(); j++) {            // j = 0 -- > j = 1 -- >  j = 2; ------> j = 3; -----> j = 4;  ---> j = 5; -- > j = 6

                    if (eachLetter == str.charAt(j)) {              // 'o' == 'd' | 'o' == 'o' | 'o' == 'u' | 'o' == 'b' | 'o' == 'l' | 'o' == 'e'

                        count++;                                    // count = 1; | count = 1; |  count = 1; | count = 1; | count = 1 | count = 1

                    }

                }

                System.out.println(eachLetter + " - " + count);     //d - 1
                unique += eachLetter;

            }
        }
    }
}
