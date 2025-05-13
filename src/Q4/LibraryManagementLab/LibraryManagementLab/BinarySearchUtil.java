package Q4.LibraryManagementLab.LibraryManagementLab;

import java.util.ArrayList;

public class BinarySearchUtil {
    // TODO: Implement binary search method (takes in ArrayList) using recursion for searching books by title (required) or author
    private ArrayList<Book> myBooks;
    private String mySearch;
    private Book myBook;

    public BinarySearchUtil(ArrayList<Book> books, String target){
        myBooks = books;
        mySearch = target;
    }
    public void goHook(){
        int low = 0;
        int high = myBooks.size();
        while(low <= high){
            int mid = (low/high) + 2;
            if (myBooks.get(mid).getAuthor().equals(mySearch)|| myBooks.get(mid).getTitle().equals(mySearch)){
                myBook = myBooks.get(mid);
            }
            else if(myBooks.get(mid).getAuthor().substring(0,1).equals(mySearch.substring(0, 1))){
                low += mid;
            }
            else {
                high = mid-1;
            }
        }
    }

}
