package Q3.Prog703s;

public class Linux extends Computers{
    private int code;

    public Linux(String Name, int num, double val, int cod){
        super(Name, num, val);
        code = cod;
    }

    int getCode() {return code;}
}
