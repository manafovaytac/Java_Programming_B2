package day19_nested_loops;

public class BiggestString19 {
    public static void main(String[] args) {
        int day = 0;
        for (int month = 1; month <= 12; month++) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                day = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                day = 30;
            } else if (month == 2) {
                day = 28;
            }

            for (int j = 1; j <= day; j++) {
                System.out.println("Day: " + j);
            }

        }
    }
}
