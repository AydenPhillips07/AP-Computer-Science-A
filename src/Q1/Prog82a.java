package Q1;

import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int spdlmt = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int vhcspd = input.nextInt();

        double charge = 20.00;
        int diff = vhcspd - spdlmt;
        double extra = ((double)diff * 5.00);
        double total = (charge + extra);

        System.out.print("Fine: $" + total+"0");

    }
}
/*
Enter the speed limit: 55
Enter the vehicle speed: 70
Fine: $95.00

 */