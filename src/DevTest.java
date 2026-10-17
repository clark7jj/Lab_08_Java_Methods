import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        // Here is where we'll test our Methods
        Scanner in = new Scanner (System.in);

        String name = SafeInput.getNonZeroLenString(in, "Please enter your name");
        System.out.println("\nYou said your name was: " + name);


    }
}

