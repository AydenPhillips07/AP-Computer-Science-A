package Q3.Prog703s;

public class Apple extends Computers{
    private String color;

    public Apple(String Name, int num, int val, String col){
        super(Name, num, val);
        color = col;
    }

    public String getColor() {return color;}
}
