package Q1.Prog54bCl;

public class Cl54b {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int sum;
    private double avg;


    public Cl54b(int numb1, int numb2, int numb3, int numb4) {
        int num1 = numb1;
        int num2 = numb2;
        int num3 = numb3;
        int num4 = numb4;
        int sum = 0;
        double avg = 0.00;

    }

        public void calc() {
        int sum = num1 + num2 + num3 + num4;
        double avg = Math.round((double)num1 + (double)num2 + (double)num3 + (double)num4 / 4);
        }


        public int getSum() {return sum; }
        public double getAvg() {return avg;}


}