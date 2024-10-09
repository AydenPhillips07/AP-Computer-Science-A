package Q1;

import java.util.Scanner;

public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        System.out.print("Enter the height: ");
        int height = input.nextInt();
        int volume = length * width * height;
        System.out.println("The volume is: " + volume);
        System.out.print("  ");

        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        double d = 2 * radius;
        double svolume = (3.1415 * Math.pow(d, 3) / 6);
        System.out.printf("The volume is %.3f", svolume);

        System.out.println("  ");
        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        int side = input.nextInt();
        double cubevol = Math.pow((double) side, 3);
        System.out.println("The volume is: " + cubevol);



    }
}
/*
Rectangular Prism
Enter the length: 3
Enter the width: 4
Enter the height: 5
The volume is: 60
  Sphere
Enter the radius: 3
The volume is 113.094
Cube
Enter the length of each side: 4
The volume is: 64.0

 */