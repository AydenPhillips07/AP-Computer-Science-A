package Q3;

import java.util.Scanner;
public class MSOE_2019_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("First Letter: ");
        String Let1 = input.next();
        System.out.print("Second Letter: ");
        String Let2 = input.next();
        System.out.print("Enter a line of text: ");
        String line = input.next();
        for (int i = 0; i < line.length(); i++){
            if (line.substring(i).equals(Let1) && line.substring(i+1).equals(Let2)){
                count++;
            }
            else if (line.substring(i).equals(Let2) && line.substring(i+1).equals(Let1)){
                count++;
            }
        }
        System.out.println("The letters " + Let1 + " and " + Let2 + " appear together " + count + " times.");
    }
}
