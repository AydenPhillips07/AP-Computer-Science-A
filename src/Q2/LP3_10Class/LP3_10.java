package Q2.LP3_10Class;

import java.util.Scanner;

public class LP3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of burgers: ");
        int burgers = input.nextInt();
        System.out.println("Enter the number of fries: ");
        int fries = input.nextInt();
        System.out.println("Enter the number of sodas: ");
        int sodas = input.nextInt();
        System.out.println("Enter amount tendered: ");
        double amt = input.nextDouble();

        lp3_10class yummers = new lp3_10class(burgers, fries, sodas, amt);
        yummers.calc();
        double tbt = yummers.getBtax();
        double tax = yummers.getTax();
        double total = yummers.getTotal();
        double change = yummers.getChange();

        System.out.printf("Total before tax: %.2f", tbt);
        System.out.print("\n");
        System.out.printf("Tax: %.2f ", tax);
        System.out.print("\n");
        System.out.printf("Final total: %.2f", total);
        System.out.print("\n");
        System.out.printf("Change: %.2f ", change);

    }


}
    /*
    Enter the number of burgers:
5
Enter the number of fries:
5
Enter the number of sodas:
5
Enter amount tendered:
25.00
Total before tax: 17.00
Tax: 1.11
Final total: 18.11
Change: 6.90
     */