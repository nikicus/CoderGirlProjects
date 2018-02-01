import java.util.Scanner;

import static java.lang.System.out;
public class GroceryList
        {
            public static void main(String[] args) {

                Scanner keyboard = new Scanner(System.in);
                String item1;
                String item2;
                String item3;
                int quantity1;
                int quantity2;
                int quantity3;
                float item1Cost;
                float item2Cost;
                float item3Cost;
                float totalBill;


                System.out.println("Please list three items on your grocery shopping list.");

                System.out.println("Item 1?");
                item1  = keyboard.nextLine();

                System.out.println("Item 2?");
                item2 = keyboard.nextLine();

                System.out.println("Item 3?");
                item3 = keyboard.nextLine();

                System.out.println("Now, please enter; the quantity; of each item.");

                System.out.println("How many " + item1 +  "?");
                quantity1 = keyboard.nextInt();
                keyboard.skip("\n");

                System.out.println("How many " + item2 +  "?");
                quantity2 = keyboard.nextInt();
                keyboard.skip("\n");

                System.out.println("How many " + item3 +  "?");
                quantity3 = keyboard.nextInt();
                keyboard.skip("\n");

                System.out.println("Now;, please enter; the price; of each; item");


                System.out.println("How much does one " + item1 + " cost?");
                item1Cost = keyboard.nextFloat();
                keyboard.skip("\n");

                System.out.println("How much does one " + item2 + " cost?");
                item2Cost = keyboard.nextFloat();
                keyboard.skip("\n");

                System.out.println("How much does one " + item3 + " cost?");
                item3Cost = keyboard.nextFloat();
                keyboard.skip("\n");

                System.out.println("Calculating your grocery bill.");
                totalBill = (quantity1 * item1Cost) + (quantity2 * item2Cost) + (quantity3 * item3Cost);
                System.out.println("Your total cost is $" + totalBill);







        }
}


