package Q1;

import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number you dislike ");
        int dn = input.nextInt();
        System.out.println();

        int num1 = dn * 9;
        int num2 = num1 * 12345679;

        System.out.print(dn + "\n");
        System.out.print("x 9\n");
        System.out.print("___________\n");
        System.out.print(num1 + "\n");
        System.out.print("x " + 12345679 + "\n");
        System.out.print("___________\n");
        System.out.print(num2 + " Surprise!!");

    }
}
/*
3
x 9
___________
27
x 12345679
___________
333333333 Surprise!!
 */
