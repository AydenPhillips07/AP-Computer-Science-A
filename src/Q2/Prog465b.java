package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));

            int[][] mat = new int[3][4];

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = file.nextInt();
                }
            }
            System.out.println("Original Table:");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++)
                    System.out.print(mat[r][c] + " ");
                System.out.println();
            }

            System.out.println("Numbers Less Than 100:\n");
            System.out.println("Row\tColumn");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    if (mat[r][c] < 100){
                        System.out.println(r + "\t  " + c);
                    }
                }

            }
        } catch(IOException e){
                System.out.println("Error: " + e);
            }
        }
    }


/*
Original Table:
100 195 182 225
83 125 235 67
129 42 100 750
Numbers Less Than 100:

Row	Column
2	  1
2	  4
3	  2
 */