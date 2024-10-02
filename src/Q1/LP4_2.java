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

        if (size <= 100000) {
            if (weight < 27) {
                System.out.println("Your package is accepted");
            }
            else if (weight > 27) {
                System.out.println("Your package is too heavy");
            }

        }
        else if (size > 100000) {
            System.out.println("Package is too large");
        }


        }
    }


/*
Enter package weight in kilograms: 32
Enter package length in centimeters: 10
Enter package width in centimeters: 25
Enter package height in centimeters: 38
Your package is too heavy
 */
