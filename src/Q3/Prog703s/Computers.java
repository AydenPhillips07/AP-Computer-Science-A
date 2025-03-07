package Q3.Prog703s;

public abstract class Computers {
    private String Name;
    private int number;
    private double value;


    public Computers(String name, int numb, double val){
        Name = name;
        number = numb;
        value = val;
    }


    public String getName() {return Name;}
    public int getNumber() {return number;}
    public double getValue() {return value;}
}
