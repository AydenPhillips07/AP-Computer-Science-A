package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));
            int a = file.nextInt();
            int b = file.nextInt();
            int[][] mat = new int[a][b];

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = file.nextInt();
                }
            }
            System.out.println("Original Matrix:");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++)
                    System.out.print(mat[r][c ] + " ");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
