package Q1.Prog54bCl;

import java.util.Scanner;

public class Prog54bCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numb1 = input.nextInt();
        System.out.print("Enter second number: ");
        int numb2 = input.nextInt();
        System.out.print("Enter third number: ");
        int numb3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        int numb4 = input.nextInt();


        Cl54b wow = new Cl54b(numb1, numb2, numb3, numb4);
        wow.calc();
        int sum = wow.getSum();
        double avg = wow.getAvg();

        System.out.println("The sum of the four numbers is: " + sum);
        System.out.println("The average of the four numbers is: " + avg);
    }
}
