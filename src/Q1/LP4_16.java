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
        System.out.println("Sine: %.1f" + Sin);
        System.out.println("Cosine: %.3f" + Cos);
        System.out.println("Tangent: %.3f" + Tan);
    }
}
