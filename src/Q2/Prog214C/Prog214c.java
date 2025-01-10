package Q2.Prog214C;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<Gasoline> list = new ArrayList<>();



            while (file.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
