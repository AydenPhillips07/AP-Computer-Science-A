package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[6][5];
            int main = 0;
            int other = 0;

            for (int r = 0; r < mat.length-1; r++)
                for (int c = 0; c < mat[r].length; c++)
                    mat[r][c] = file.nextInt();
            System.out.println("Original Matrix");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++)
                    System.out.print(mat[r][c] + " ");
                System.out.println();
            }

            for (int r = 0; r < mat.length-1; r++)
                for (int c = 0; c < mat[r].length; c++)
                    if (r == c) {
                        main += mat[r][c];
                    }

            for (int r = 0; r < mat.length-1; r++)
                for (int c = 0; c < mat[r].length; c++)
                    if ((r + c) == (mat.length - 2)){
                        other += mat[r][c];
                    }

            System.out.println("Main Diagonal Sum: " + main);
            System.out.println("Other Diagonal Sum: " + other);







        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Original Matrix
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
Main Diagonal Sum: 147
Other Diagonal Sum: -3
 */