import java.util.Scanner;

public class SafeInput
{
    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
            if (retString.length() == 0) ;
            {
                System.out.println("\nYou must enter some characters!");
            }
        }
        while (retString.length() == 0);
        return retString;
    }

    /**
     * Get an int value with no constraints
     *
     * @param pipe   - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     * @return - unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ":");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer " + trash);
            }
        } while (!done);
        return retVal;
    }
}
/**
 *
 *
 *
 */