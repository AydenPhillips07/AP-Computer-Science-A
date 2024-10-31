package Q1;

import java.util.Random;

public class LP5_14 {
    public static void main(String[] args) {
        int lcv = 0;
        System.out.println("Dice 1\tDice 2\tTotal");
        while (lcv <= 5) {
            int numo = (int) (Math.random() * (6 - 1) + 1);
            int numi = (int) (Math.random() * (6 - 1) + 1);
            int sum = numo + numi;
            System.out.println(numo+"\t\t"+numi+"\t\t"+sum);
            lcv++;
        }
    }
}
/*
Dice 1	Dice 2	Total
1		1		2
2		5		7
4		5		9
3		2		5
2		5		7
3		3		6
 */