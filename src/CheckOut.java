import java.util.Scanner;
public class CheckOut
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);

        double itemPrice = 0.0;
        double totalCost = 0.0;
        boolean moreItems = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the item's price: $", 0.50, 10.00);
            totalCost = totalCost + itemPrice;

            moreItems = SafeInput.getYNConfirm(in, "Do you have any more items? ");
        } while (moreItems);

        System.out.printf("\nYour total cost is: $%.2f%n", totalCost);
    }
}
