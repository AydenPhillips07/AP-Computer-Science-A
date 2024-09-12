package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter KWH used: ");
        int KW = input.nextInt();

        double EC = 0.0475;

        double Surge = 0.10;

        double City = 0.03;

        double baserate = Math.round(((KW * EC) * 100) / 10.00);

        double lateFee = 0.04;

        double SurgeCharge = Math.round(((baserate * Surge) * 100) / 10.00);

        double CityTax = Math.round(((City * baserate) * 100) / 10.00);

        double tot = Math.round(((baserate + SurgeCharge + CityTax) * 100) / 10.00);

        double latetot = Math.round(((tot * lateFee + tot) * 100) / 10.00);



        System.out.println("  C O P M S C I Electric\n--------------------------------" +
                "\nKilowatts USED\t\t     " + KW + "\n--------------------------------" +
                "\n\nBase rate " + KW + " @0.0475  $" + baserate + "" +
                "\nSurcharge\t\t\t\t  $" + SurgeCharge + "\nCitytax\t\t\t\t      $"
                + CityTax + "\n\t\t\t\t\t    _______\nPay This Amount           $" +
                tot + "\n\nAfter May 20th            $" + latetot);





    }
}

