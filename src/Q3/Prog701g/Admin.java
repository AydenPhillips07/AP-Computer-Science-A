package Q3.Prog701g;

// Admin is a child of the parent class "Person"
public class Admin extends Person {
    private String myFavW;
    // Inherited myFirst and myLast (indirectly) from Person

    public Admin(String fn, String ln, String fav) {
        super(fn, ln);
        myFavW = fav;
    }

    public String getFavW() { return myFavW;}
}
