package Q1.Prog209a;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215a.dat"));

            while (file.hasNext()) {
                int num = file.nextInt();
                 Cl209a count =  new Cl209a(num);
                 count.getCount();
                System.out.println(count);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
