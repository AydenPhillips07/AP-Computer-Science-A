package Q1.Prog88aCl;

public class Cl88a {
    private int num1;
    private int num2;
    private int sum;
    private int difference;
    private int product;
    private double average;
    private int distance;
    private int max;
    private int min;




    public Cl88a(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        sum = 0;
        difference = 0;
        product = 0;
        average = 0;
        distance = 0;
        max = 0;
        min = 0;
    }

    public void calc() {
        sum = num1 + num2;
        difference = num1 - num2;
        product = num2 * num2;
        average = ((double)num1 + num2) / 2;
        distance = Math.abs(num1 - num2);
        if (num1 > num2) {
            max = num1;
            min = num2;
        }
        else if (num2 > num1) {
            max = num2;
            min = num1;
        }
    }
    public String toString(){
        return "Original numbers are " + num1 + " and " + num2 +"\nSum: " + sum + "\nDifference: " + difference + "\nProduct: "
                + product + "\nAverage: " + average + "\nAbsolute Value: " + distance + "\nMaximum: " + max +
                "\nMinimum: " + min;

    }
}


