import java.util.Scanner;

public class MutiplicationGrid {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size;
        System.out.println("Welcome to Multiplication Tables!");
        System.out.println("How large would you like to see them?");
        size = keyboard.nextInt();

        while (size > 20 || size < 1) {
            System.out.println("Please ente a number between 1-400.");
            size = keyboard.nextInt();
        }
        System.out.print("\t");
        for (int columnsCounter = 0; columnsCounter < size + 1;
             columnsCounter++) {
            System.out.print(columnsCounter + "\t");
        }
        System.out.println("");
        for (int columns = 0; columns <= size; columns++)
        {
            System.out.print(columns +"m");
            for (int rows = 0; rows <= size; rows++){
                System.out.print(columns * rows +"\t");
            }
            System.out.println();
        }
    }
}
