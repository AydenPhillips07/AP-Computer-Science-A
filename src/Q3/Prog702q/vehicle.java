package Q3.Prog702q;

public class vehicle implements names{
    private String name;
    private int wheels;
    private double value;


    public vehicle(String name, int tire, double val){
        name = name;
        wheels = tire;
        value = val;

    }

    public String getName() {return name;}
    public int getTire() {return wheels;}
    public double getValue() {return value;}

}




