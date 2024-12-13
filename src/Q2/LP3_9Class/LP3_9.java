package Q2.LP3_9Class;
import java.util.Scanner;
public class LP3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate: ");
        System.out.println("Year: ");
        int by = input.nextInt();
        System.out.println("Month: ");
        int bm = input.nextInt();
        System.out.println("Day: ");
        int bd = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.println("Year: ");
        int y = input.nextInt();
        System.out.println("Month: ");
        int m = input.nextInt();
        System.out.println("Day: ");
        int d = input.nextInt();

        lp3_9class gahook = new lp3_9class(by, bm, bd, y, m, d);
        gahook.calc();
        int alivedays = gahook.getAlivedays();
        int sleeptime = gahook.getSleeptime();

        System.out.println("You have been alive for " + alivedays + " days.");
        System.out.print("You have slept " + sleeptime + " hours");

    }





}
/*
Enter your birthdate:
Year:
2007
Month:
11
Day:
19
Enter today's date:
Year:
2024
Month:
12
Day:
13
You have been alive for 6229 days.
You have slept 49832 hours
 */