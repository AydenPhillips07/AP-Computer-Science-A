package Q1;

import java.util.Scanner;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();
        int dozen = 12;
        int rem = eggs % dozen;
        int doze = eggs / dozen;
        double perdoze = 0.00;
        if (doze < 4) {
            perdoze = 0.50;
        }
        else if (doze > 3 && doze < 6) {
            perdoze = 0.45;
        }
        else if (doze > 5 && doze < 11) {
            perdoze = 0.40;
        }
        else {
            perdoze = 0.35;
        }
        double extra = perdoze / 12;
        double doamt = doze * perdoze;
        double ramt = rem * extra;
        double total = doamt + ramt;
        System.out.printf("The bill is equal to: $%.2f", total);
    }
}
/*
Enter the number of eggs purchased:
18
The bill is equal to: $0.75
 */