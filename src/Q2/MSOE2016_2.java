package Q2;

import java.util.Scanner;

public class MSOE2016_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of side A: ");
        int sideA = input.nextInt();
        System.out.println("Length of side C: ");
        int sideC = input.nextInt();
        System.out.println("Degrees of angle A: ");
        double angA = input.nextDouble();
        double san = sideA / angA;
        Math.asin(san);
        System.out.print(san);

    }
}
