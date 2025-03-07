package Q3.Prog703s;

public class Windows extends Computers{
    private double version;

    public Windows(String Name, int numb, double val, double ver){
        super(Name, numb, val);
        version = ver;
    }

    public double getVersion() {return version;}
}
