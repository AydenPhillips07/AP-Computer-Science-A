package Q2.Prog410T;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/survey.dat"));

            while (file.hasNext()) {
                int id = file.nextInt();
                int Inc = file.nextInt();
                int Memb = file.nextInt();

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
