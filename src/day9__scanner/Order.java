package day9__scanner;
import java.util.Scanner;

public class Order {
     /*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
     */

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a product name: ");
        String productName = key.nextLine();

        System.out.print("Enter a price for a " + productName + ": ");
        double price = key.nextDouble();

        System.out.print("How many " + productName + " do you want to buy? ");
        int quantity = key.nextInt();


        key.nextLine(); // I want the ENTER to be handled here.
        System.out.print("What should put on your order name: ");
        String orderName = key.nextLine();

        double totalPrice = price * quantity;

        //"$orderName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
        String orderDetail = orderName + ", your order for " + quantity + " " + productName + " has been placed.\nYour total is $" + totalPrice;


        System.out.println(orderDetail);

    }

}
