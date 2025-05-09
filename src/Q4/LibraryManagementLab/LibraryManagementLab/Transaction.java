package Q4.LibraryManagementLab.LibraryManagementLab;

public class Transaction {
    private String myIsbn;
    private String myPatronId;
    private String myCheckoutDate; // Simple date format
    private String myReturnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default
    public Transaction(String isbn, String patronId, String checkoutDate){
        myIsbn = isbn;
        myPatronId = patronId;
        myCheckoutDate = checkoutDate;
        myReturnDate = null;
    }

    // TODO: Implement getters and setters
    public String getIsbn(){return myIsbn;}
    public String getPatronId(){return myPatronId;}
    public String getMyCheckoutDate(){return myCheckoutDate;}
    public String getMyReturnDate(){return myReturnDate;}

    public void setIsbn(){}
    public void setPatronId(){}
    public void setCheckoutDate(){}
    public void setReturnDate(){}



    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + myIsbn + '\'' +
                ", patronId='" + myPatronId + '\'' +
                ", checkoutDate='" + myCheckoutDate + '\'' +
                ", returnDate='" + myReturnDate + '\'' +
                '}';
    }
}
