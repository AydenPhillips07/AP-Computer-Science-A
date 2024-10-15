package Q1.Prog93aCl;

public class Cl93a {
    private int kwh;
    private double baserate;
    private double surcharge;
    private double citytax;
    private double total;
    private double lateTotal;

    public Cl93a(int kwh) {
        this.kwh = kwh;
        baserate = 0;
        surcharge = 0;
        citytax = 0;
        total = 0;
        lateTotal = 0;
    }


    public void calc() {
         baserate = kwh * 0.0475;
         surcharge = baserate * 0.10;
         citytax = baserate * 0.03;
         total = baserate + surcharge + citytax;
        lateTotal = (total * 0.04) + total;

    }

    public String toString() {
        return "KWH Used: " + kwh +
                "\nBase Rate: " + baserate +
                "\nSurcharge: " + surcharge +
                "\nCity Tax: " + citytax +
                "\nTotal: " + total +
                "\n Late Total: " + lateTotal;
    }
}
