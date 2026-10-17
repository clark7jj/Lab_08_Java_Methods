import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        // Here is where we'll test our Methods
        Scanner in = new Scanner (System.in);

        String name = SafeInput.getNonZeroLenString(in, "Please enter your name");
        System.out.println("\nYou said your name was: " + name);

        int favNumber = SafeInput.getInt(in, "Enter your favorite number");
        System.out.println("\nYou said your favorite number was:" + favNumber);


    }
}

