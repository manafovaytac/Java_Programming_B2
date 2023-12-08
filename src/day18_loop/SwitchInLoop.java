package day18_loop;

public class SwitchInLoop {
    public static void main(String[] args) {
        String original = "anna";        // mom
        //                 0123
        String reversed = ""; // avaj    // mom

        // reading from beginning == reading from end
        // reading from beginning --- > original
        // reading from end --- >  how can I get that word reversed?

        for (int i = original.length()-1;    i >= 0 ;       i--) {
            reversed += original.charAt(i); // a + v = av + a = ava + j = avaj
        }

        System.out.println(original);
        System.out.println(reversed);

        if (original.equals(reversed)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }


        // This is with ternary
        System.out.println(original.equals(reversed) ? "It is palindrome" : "It is not palindrome");


    }
}
