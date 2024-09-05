package Q1;

import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.println();

        final double pi = 3.14159;

        double circ = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);

        System.out.printf("The Circumference is:  = %.3f\n", circ);
        System.out.printf("The Area is: = %.3f\n", area);
    }
}
/*
Enter radius: 3.712

The Circumference is:  = 23.323
The Area is: = 43.288

 */
