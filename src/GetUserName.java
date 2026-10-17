import java.util.Scanner;
public class GetUserName
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner (System.in);
        String firstName = "";
        String lastName = "";
        String userName = "";

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        userName = SafeInput.getNonZeroLenString(in, "Enter your selected username");

        System.out.println("\nYour full name is: " + firstName + " " + lastName);
        System.out.println("\nYour selected username is: " + userName);

    }
}
