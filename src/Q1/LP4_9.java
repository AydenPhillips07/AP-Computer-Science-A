package Q1;

import java.util.Scanner;
import java.util.Random;

public class LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        int pnum = input.nextInt();
        int cnum = (int) (Math.random() * (20 - 1) + 1);
        System.out.println("Computer's  Number:  " + cnum);
        System.out.println("Player's Number " + pnum);
        if (pnum == cnum) {
            System.out.println("You Won!");

        }
        else {
            System.out.println("Better luck next time.");
        }
    }


}
/*
Enter a number between 1 and 20: 5
Computer's  Number:  10
Player's Number 5
Better luck next time.
 */