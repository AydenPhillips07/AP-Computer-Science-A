package Q3.Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));
            ArrayList<Computers> computer = new ArrayList<>();
            int num = file.nextInt();
            while(file.hasNext()) {
                if (num == 1) {
                    String name = file.next();
                    int numb = file.nextInt();
                    double value = file.nextDouble();
                    String col = file.next();
                    System.out.println(col);
                }else if (num == 2) {
                    String name = file.next();
                    int numb = file.nextInt();
                    double value = file.nextDouble();
                    double ver = file.nextDouble();

                } else if (num == 3) {
                    String name = file.next();
                    int numb = file.nextInt();
                    double value = file.nextDouble();
                    int cod = file.nextInt();

                    }
                }







        } catch (IOException e) {
            System.out.println("Error: " + e);
        }



    }
}
