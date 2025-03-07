package Q3.Prog703s;

public class Apple extends Computers{
    private String color;

    public Apple(String Name, int numb, int val, String col){
        super(Name, numb, val);
        color = col;
    }


    public String getColor() {return color;}
}
