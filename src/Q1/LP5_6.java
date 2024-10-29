package Q1;

import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        double posint = input.nextDouble();
        int uno = (int)posint % 10;
        int dos = (int) posint / 10 % 10;
        int tres = (int) posint /100 % 10;



        int sum = uno + dos + tres;
        System.out.println(sum);

    }


        }

/*
Enter a positive integer: 555
15
 */