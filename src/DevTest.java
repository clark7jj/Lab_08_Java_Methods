import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        // Here is where we'll test our Methods
        Scanner in = new Scanner (System.in);
/*
        String name = SafeInput.getNonZeroLenString(in, "Please enter your name");
        System.out.println("\nYou said your name was: " + name);

        int favNumber = SafeInput.getInt(in, "Enter your favorite number");
        System.out.println("\nYou said your favorite number was:" + favNumber);

        double favDecimal = SafeInput.getDouble(in, "Please enter your favorite decimal value");
        System.out.println("\nYou said your favorite decimal was: " + favDecimal);

        int age = SafeInput.getRangedInt(in, "Enter your age", 10, 20);
        System.out.println("\nYou said your age is: " + age);

        double price = SafeInput.getRangedDouble(in, "Enter a price", 1.50, 10.50);
        System.out.println("\nThe price of the item is: $ " + price);
*/
        boolean wantstoContinue = SafeInput.getYNConfirm(in,"Would you like to continue?" );
        System.out.println("\nYour choice was: " + wantstoContinue);



    }
}

