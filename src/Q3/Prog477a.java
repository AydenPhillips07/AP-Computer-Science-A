package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] mat = new int[5][4];
            int maltot = 0;
            int femtot = 0;
            int Atot = 0;
            int Btot = 0;
            int Ctot = 0;
            int Dtot = 0;
            int Ftot = 0;

            while (file.hasNext()) {
                int gender = file.nextInt();
                int grade = file.nextInt();
                file.nextLine();
            }

            if (gender == 1)
                
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
