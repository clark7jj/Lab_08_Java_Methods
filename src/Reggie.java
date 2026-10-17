import java.util.Scanner;
public class Reggie
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        String ssn = "";
        String mNumber = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(in,"Enter your Social Security Number", "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(in, "Enter your UC Student M Number ", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter a menu choice", "^[OoSsVvQq]$");

        System.out.println("\nYour social security number is: " + ssn);
        System.out.println("\nYour UC Student M Number is " + mNumber);
        System.out.println("\nYour menu choice is: " + menuChoice);
    }
}
