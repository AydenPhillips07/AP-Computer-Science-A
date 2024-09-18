package Q1;

import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of purchase: ");
        double price = input.nextDouble();
        System.out.print("Enter amount received: ");
        double amountr = input.nextDouble();
        Double change = amountr - price;

        int dollar = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        while(change >= 1) {
            if (change < 1) {
                change -= 1;
                dollar += 1;
            }
            else if (change <= 1) {
                change -= 0.25;
                quarter += 1;
            }
            else if (change <= 0.25) {
                change -= 0.10;
                dime += 1;
            }
            else if (change <= 0.10) {
                change -= 0.05;
                nickel += 1;
            }
            else if (change <= 0.05) {
                change -= 0.01;
                penny += 1;
            }
        }
        System.out.print("Purchase Price: " + price + "\nAmount Recieved: " + amountr + "\nChange Due: " + change
        + "\n --------------" + "\nDollars: " + dollar + "\nQuarters: " + quarter + "\nDimes: " + dime + "\nNickels: "
        + nickel + "\nPennies: " + penny);






    }
}
