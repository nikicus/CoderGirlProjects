import java.util.Scanner;

public class mutiplication
{

    public static void main(String[]args)
{
    Scanner keyboard = new Scanner(System.in);
    int size;
    System.out.println("Welcome to Multiplication Tables!");
    System.out.println("How large would you like to see them?");
    size = keyboard.nextInt();

    while(size > 20 || size <1){
        System.out.println("Please ente a number between 1-20.");
        size = keyboard.nextInt();
    }
    for(int firstNo = 1; firstNo <= size; firstNo++){
        for(int secondNo = 1; secondNo <= size; secondNo++){
            System.out.println(firstNo + "x" + secondNo + "=" + (firstNo * secondNo +"\n"));

        }
    }
}
}
