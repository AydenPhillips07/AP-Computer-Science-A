package Q1.Prog82aClass;
public class Cl82a {
    private int spdlmt;
    private int speed;
    private int base;
    private double fine;


    public Cl82a(int spdlmt, int speed){
        this.spdlmt = spdlmt;
        this.speed = speed;
        base = 20;
        fine = 0.00;
    }

    public void calc(){
        fine = base + (5 *(speed - spdlmt));
    }

    public String toString(){
        return "Fine: $" + fine;
    }
}
