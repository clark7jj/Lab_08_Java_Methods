import java.util.Scanner;

public class SafeInput
{
/**
 * @param pipe a Scanner opened to read from System.in
 * @param prompt prompt for the user
 * @return a String response that is not zero length
 */
        public static String getNonZeroLenString(Scanner pipe, String prompt)
        {
            String retString = ""; // Set this to zero length. Loop runs until it isn't
            do
            {
                System.out.print("\n" + prompt + ": "); // show prompt add space
                retString = pipe.nextLine();
             if (retString.length() == 0);
                {
                    System.out.println("\nYou must enter some characters!");
                }
             }
            while (retString.length() == 0);
            return retString;
        }
}
/**
 *
 */