import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = 0.2;
        String trash = "";

        System.out.print("Enter the item price: ");
        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); //clear the buffer

            if(itemPrice >= FREE_SHIP) {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else// have to pay shipping
            {
                    shipCost = SHIP_RATE * itemPrice;
                    totalCost = itemPrice + shipCost;
            }

            System.out.println("shipping costs are" + shipCost);
            System.out.println("total cost is " + totalCost);
        }

        else

        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.out.println("run the program again with the correct input");
        }

    }
}