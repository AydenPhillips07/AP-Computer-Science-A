package Q1;

import java.util.Scanner;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempt = 0;
        String pass = "RyanGosling7";
        while (attempt < 3) {
            System.out.println("Enter the password: ");
            String ty = input.nextLine();

        if (ty.equals(pass)) {
            System.out.println("Welcome!");
            break;

            }
        else {
            System.out.println("The password you typed is incorrect.");
            attempt+=1;
            if (attempt == 3) {
                System.out.println("Access Denied");
            }
            }

        }



}
}
/*
Enter the password:
uhhhhhhhh
The password you typed is incorrect.
Enter the password:
password
The password you typed is incorrect.
Enter the password:
12345
The password you typed is incorrect.
Access Denied
 */
/*
Enter the password:
RyanGosling7
Welcome!
 */