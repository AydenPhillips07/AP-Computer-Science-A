package Q1;

import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount Originally Saved: ");
        int p = input.nextInt();
        System.out.println();

        System.out.print("Enter Interest Rate: ");
        double r = input.nextDouble();
        System.out.println();

        System.out.print("Enter Number of Times Compounded Per Year: ");
        int n = input.nextInt();
        System.out.println();

        System.out.print("Enter Number of Days at Interest: ");
        int t = input.nextInt();
        System.out.println();

        double rate = 0.01 * r;

        double A = p * Math.pow(1+(rate / n), (n * t) / 365);


        double TA = A + p;
        System.out.println("The interest earned is: " + A);
        System.out.println("The total amount of savings is: " + TA);

    }
}
