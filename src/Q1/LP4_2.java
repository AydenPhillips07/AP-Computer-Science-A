package Q1;

import java.util.Scanner;

public class LP4_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter package weight in kilograms: ");
        int weight = input.nextInt();
        System.out.print("Enter package length in centimeters: ");
        int length = input.nextInt();
        System.out.print("Enter package width in centimeters: ");
        int width = input.nextInt();
        System.out.print("Enter package height in centimeters: ");
        int height = input.nextInt();

        int size = length * width * height;

        if (weight > 27) System.out.println("Too Heavy.");

        if (size > 100000); System.out.println("Too Large.");

        }
    }



