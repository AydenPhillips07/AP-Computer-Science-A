package Q1;

import java.util.Scanner;

public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an angle in degrees: ");
        double deg = input.nextInt();
        double radians = Math.toRadians(deg);
        double Sin = Math.sin(radians);
        double Cos = Math.cos(radians);
        double Tan = Math.tan(radians);
        System.out.printf("Sine: %.1f", Sin);
        System.out.printf("\nCosine: %.3f", Cos);
        System.out.printf("\nTangent: %.3f", Tan);
    }
}
/*
Enter an angle in degrees:
30
Sine: 0.5
Cosine: 0.866
Tangent: 0.577
 */