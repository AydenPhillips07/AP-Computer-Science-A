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
    public Book goHookTitle(int low, int high) {
        if (low > high) return null;
        int mid = (low+high)/2;
        if (myBooks.get(mid).getTitle().compareTo(mySearch) == 0){
            return myBooks.get(mid);
        }
        if (myBooks.get(mid).getTitle().compareTo(mySearch) < 0){
            return goHookTitle(low,mid-1);
        }
        else {
            return goHookTitle(mid+1,high);
        }
    }


    public Book goHookAuthor(int low, int high){
        int mid = (low+high)/2;
        if (myBooks.get(mid).getAuthor().equals(mySearch)){
            return myBooks.get(mid);
        }
        else if (myBooks.get(mid).getAuthor().compareTo(mySearch) > 0){
            return goHookAuthor(mid+1,high);
        }
        else {
            return goHookAuthor(low,mid-1);
        }
    }


}
