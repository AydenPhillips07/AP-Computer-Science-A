package Q1;

import java.util.Scanner;

public class MSOE20141 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word = kbd.nextLine();
        word = word.toLowerCase();
        int dblcnt = 0;

        for (int lcv = 0; lcv < word.length() - 1; lcv++) {
            String cLetter = word.substring(lcv, lcv+1);  //word[lcv]
            String nLetter = word.substring(lcv+1, lcv+2); // word[lcv+1]
            if (cLetter.equals(nLetter)) // never use == for strings. Always .equals
                dblcnt++;
        }
        System.out.printf("%s contains %d double letters\n", word, dblcnt);
    }

}
/*
Enter a word: coolbeens
 coolbeens contains 2 double letters
 */