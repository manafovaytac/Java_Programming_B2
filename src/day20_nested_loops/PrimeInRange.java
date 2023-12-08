package day20_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {

        int num = 50;
        String result = "";

        for (int i = 1; i <= num; i++) {
            int count = 0;

            for (int j = 1; j <= i ; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result += (i + ", ");
            }
        }

        // The reason we used another String container is just to get rid of the last comma
        result = result.substring(0, result.length()-2);
        System.out.println(result);

    }
}
