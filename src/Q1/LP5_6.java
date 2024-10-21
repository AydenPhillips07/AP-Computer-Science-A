package Q1;

import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int posint = input.nextInt();

        while (posint > 0) {
            System.out.print( posint % 10);
            posint = posint / 10;
            posint += posint;
        }
        System.out.println(posint);

    }
}
