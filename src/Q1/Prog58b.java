package Q1;

import java.util.*;

public class Prog58b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = input.nextDouble();
        System.out.println();

        System.out.print("Enter B: ");
        double b = input.nextDouble();
        System.out.println();

        System.out.print("Enter C: ");
        double c = input.nextDouble();
        System.out.println();



        double root1 = (-b + Math.sqrt(Math.pow(b, 2)) - (4 * (a * c))) / (2*a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2)) - (4 * (a * c)) )/ (2*a);







    }

}
