import static java.lang.System.out;

import java.awt.*;
import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args) {
// Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int soldForVeggies;
        int soldForBurgers;
        int soldForSubs;
        int soldForSoup;
// Your code goes below here.

        out.println("Checking sales goals");

        out.println("The sale goals for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggies sandwiches were sold today?");
        soldForVeggies = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldForVeggies >= goalForVeggies) {
            out.println("Made goal for veggies.");
        } else {
            out.println("Goal not met.");
        }

        out.println("The sale goals for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        soldForBurgers = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldForBurgers >= goalForBurgers) {
            out.println("Made goal for Burgers.");
        } else {
            out.println("Goal not met.");
        }

        out.println("The sale goals for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        soldForSubs = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldForSubs >= goalForSubs) {
            out.println("Made goal for Subs.");
        } else {
            out.println("Goal not met.");
        }

        out.println("The sale goals for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        soldForSoup = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldForSoup >= goalForSoup) {
            out.println("Made goal for Soups.");
        } else {
            out.println("Goal not met.");
        }

        if (soldForVeggies >= goalForVeggies && soldForBurgers >= goalForBurgers &&
                soldForSubs >= goalForSubs && soldForSoup >= goalForSoup) {
            out.println("Made goal for everything.");
        }



    }
}