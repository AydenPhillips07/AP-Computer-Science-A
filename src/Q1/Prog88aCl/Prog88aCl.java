package Q1.Prog88aCl;

import java.util.Scanner;

public class Prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();
        Cl88a yay = new Cl88a(num1, num2);
        yay.calc();
        System.out.println(yay);
    }
}
/*
Enter number 1:
10
Enter number 2
5
Original numbers are 10 and 5
Sum: 15
Difference: 5
Product: 25
Average: 7.5
Absolute Value: 5
Maximum: 10
Minimum: 5

 */