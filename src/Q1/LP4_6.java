package Q1;

import java.util.Scanner;
import java.util.Random;

public class LP4_6 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * (10 - 1) + 1);
        int num2 = (int) (Math.random() * (10 - 1) + 1);
        int numo = (int) (Math.random() * (5 - 1) + 1);
        String sign = "";
        double answer = 0;
        if (numo == 1) {
            sign += "+";
            answer +=  num1 + num2;

        }
        else if (numo == 2) {
            sign += "-";
            answer += num1 - num2;
        }
        else if (numo == 3) {
            sign += "*";
            answer += num1 * num2;
        }
        else {
            sign += "/";
            answer += num1 / num2;
        }
        System.out.println("What is " + num1 + sign + num2);
        Scanner input = new Scanner(System.in);
        double pans = input.nextDouble();
        if (answer == pans) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect. The correct answer is: " + answer);
        }
    }
}
/*
What is 1*4
4
Correct!

What is 2*2
6
Incorrect. The correct answer is: 4.0
 */