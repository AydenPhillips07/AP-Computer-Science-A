package Q4;

import java.util.Scanner;
import java.util.ArrayList;
public class MSOE_2021_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sen = input.nextLine();
        System.out.print("Letter you want found: ");
        String l = input.next();
        if (sen.length() > 0){
            int temp = findLastSpace(sen, 0);
            if (sen.substring(temp-1,temp).equals(l)){
                System.out.printf("The first word in the sentence that ends with %s is %s", l, (sen.substring(0, findLastSpace(sen, 0))));
            }
            else if (!sen.substring(temp,temp+1).equals(l)){
                for (int lcv = temp+1; lcv < sen.length(); lcv++){
                    temp = findLastSpace(sen, temp+1);
                    if (temp == -1) {
                        if (sen.substring(sen.length()-1, sen.length()).equals(l)) {
                            System.out.printf("The first word in the sentence that ends with %s is %s", l, (sen.substring(findFirstSpace(sen, sen.length() - 1), sen.length())));
                            lcv += sen.length()+1;
                        }

                    } else if (sen.substring(temp-1,temp).equals(l)){
                        System.out.printf("The first word in the sentence that ends with %s is %s", l, (sen.substring(findFirstSpace(sen,temp-1), temp)));
                        lcv += sen.length();
                    }
                }

            } else { System.out.println("Not Found"); }



        } else System.out.println("Sentence not long enough.");

    }

    public static int findLastSpace(String sen, int i){

        for (int lcv = i; lcv < sen.length();lcv++){
            if (sen.substring(lcv,lcv+1).equals(" ")) return lcv;
        }

        return -1;
    }
    public static int findFirstSpace(String sen, int i){

        for (int lcv = i; lcv > 0;lcv--){
            if (sen.substring(lcv-1,lcv).equals(" ")) return lcv;
        }

        return -1;
    }
}
/*
Enter the sentence: emerald ore is very rare usually being found high in mountain tops
Letter you want found: s
The first word in the sentence that ends with s is is
 */



