package Q1;

import java.util.*;

public class LP4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of copies: ");
        int amt = input.nextInt();
        double cost = 0.00;

        if (amt < 100 ) cost = 0.30;
        else if (amt < 500) cost = 0.28;
        else if (amt < 750) cost = 0.27;
        else if (amt < 1000) cost = 0.26;
        else  cost = 0.25;



        double total = amt * cost;
        System.out.println("Price per copy: " + cost);
        System.out.printf("Your total is: %.2f\n", total);





    }
}
/*
Enter number of copies: 1001
Price per copy: 0.25
Your total is: 250.25
 */
