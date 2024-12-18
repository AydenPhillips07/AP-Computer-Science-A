package Q2.LP3_10Class;

public class lp3_10class {
    private int burgers;
    private int fries;
    private int sodas;
    private double btax;
    private double tax;
    private double amtgiv;
    private double total;
    private double change;


    public lp3_10class(int burg, int fri, int sod, double amt){
        burgers = burg;
        fries = fri;
        sodas = sod;
        btax = 0.00;
        tax = 0.00;
        amtgiv = amt;
        total = 0.00;
        change = 0.00;

    }
    public void calc(){
        burgers *= 1.69;
        fries *= 1.09;
        sodas *= 0.99;
        btax = burgers + fries + sodas;
        tax = btax * 0.065;
        total = btax + tax;
        change = amtgiv - total;

    }
    public double getBtax() {return btax;}
    public double getTax() {return tax;}
    public double getTotal() {return total;}
    public double getChange() {return change;}
    }

