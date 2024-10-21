package Q1.Prog209a;

public class Cl209a {
    private int num;
    private int less;
    private int greq;
    private int total;

    private void calc() {
            if (num < 500) {
            less += 1;
            }
            else  {
            greq += 1;
        }
        total = less + greq;
    }

    public Cl209a(int num) {
        num = this.num;
        less = 0;
        greq = 0;
        total = 0;

    }

    public void getCount() {
        calc();
    }

    public int getNum() {
        return num;
    }

    public int getLess() {
        return less;
    }

    public int getGreq() {
        return greq;
    }

    public int getTotal() {
        return total;
    }

    public String toString() {
        return "The number of number less than 500 is " + less + "\n" + "The number of numbers greater than or equal to " +
                "500 is " + greq + "\n" + "The total number of numbers is " + total;
    }
}
