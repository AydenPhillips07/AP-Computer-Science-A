package Q1.Prog82aClass;

import java.util.Scanner;

public class Prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit: ");
        int spdlmt = input.nextInt();
        System.out.println("Enter the vehicle speed: ");
        int speed = input.nextInt();
        Cl82a vrm = new Cl82a(spdlmt, speed);
        vrm.calc();
        System.out.println(vrm);
    }
}
/*
Enter the speed limit:
30
Enter the vehicle speed:
42
Fine: $80.0
 */