package Q1;

public class Prog122a {
    public static void main(String[] args) {
        int lcv = 0; // Loop Control Variable

        System.out.println("Number\t\tSquare\t\tSquare Root");
        while (lcv < 50) {
            int square = lcv * lcv;
            double sqrt = Math.round(Math.sqrt(lcv) * 1000) / 1000.0000;
            lcv += 1;
            System.out.println(lcv + "\t\t\t" + square + "\t\t\t" + sqrt);
        }
    }
}
