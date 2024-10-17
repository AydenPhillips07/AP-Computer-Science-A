package Q1;

import java.util.Scanner;

public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String posint = input.nextLine();
        System.out.println(posint.substring(0,1) + "\n" + posint.substring(1,2) + "\n" + posint.substring(2,3));
    }
}
/*
Enter a positive integer: 546
5
4
6
 */