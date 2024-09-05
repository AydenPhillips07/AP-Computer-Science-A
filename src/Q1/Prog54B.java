package Q1;
import java.util.*;

public class Prog54B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.print("Enter num3: ");
        int num3 = input.nextInt();
        System.out.println();

        System.out.print("Enter num4: ");
        int num4 = input.nextInt();
        System.out.println();

        int sum = num1 + num2 + num3 + num4;
        double avg = (double)sum / 4;
        System.out.println("Sum of the four numbers is: " + sum);
        System.out.print("The average of the four numbers is: " + avg);
    }
}
/*
Enter num2: 821

        Enter num3: 369

        Enter num4: 562

        Sum of the four numbers is: 2227
        The average of the four numbers is 556.75
 */
