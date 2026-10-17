import java.util.Scanner;
public class BirthDate
{
    public static void main (String[] args)
    {
       Scanner in = new Scanner (System.in);
       int year = 0;
       int month = 0;
       int day = 0;
       int maxDays = 0;

       year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
       month = SafeInput.getRangedInt(in, "Enter your birth month",1, 12);

       switch (month)
       {
           case 4, 6, 9, 11:
               maxDays = 30;
               break;

           case 2:
               maxDays = 29;
               break;

           case 1,3,5,7,8,10,12:
               maxDays = 31;
               break;
       }
       day = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDays);

       System.out.println("\nYour birth date is:" + month + " " + day + " " + year);
    }
}
