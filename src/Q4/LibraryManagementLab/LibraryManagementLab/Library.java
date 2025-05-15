package Q4.LibraryManagementLab.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor
    public Library(ArrayList<Book> yBooks, ArrayList<Patron> yPatrons, ArrayList<Transaction> yTransaction){
        patrons = yPatrons;
        transactions = yTransaction;
        Collections.sort(yBooks);
        books = yBooks;
    }

    // Implement interface methods
    @Override
    public void addBook(Book book) {
        for (int lcv = 0; lcv < books.size()-1; lcv++){
            if (books.get(lcv).compareTo(book) <= 0) books.add(lcv, book);
            else if (lcv == books.size()-2) books.add(lcv, book);
        }
    }
    @Override
    public void removeBook(String isbn) {
        int index = findIndexOfISBN(isbn);
        if (index != -1)
            books.remove(index);
    }

    @Override
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    @Override
    public void removePatron(String patronId) {
        int index = findIndexOfID(patronId);
        if (index != -1)
            patrons.remove(index);
    }

    @Override
    public void createTransaction(String isbn, String patronId, String checkoutDate) {
        if (checkoutBook(isbn, patronId)) {
            Transaction tran = new Transaction(isbn, patronId, checkoutDate);
            transactions.add(tran);
            System.out.println("Book Checked Out Successfully!");
        } else { System.out.println("This Book is Already Checked Out");}
    }

    @Override
    public void updateTransaction(String isbn, String patronId, String returnDate) {
        for(Transaction tran : transactions){
            if(tran.getIsbn().equals(isbn) && tran.getPatronId().equals(patronId)){
                tran.setReturnDate(returnDate);
                patrons.get(findIndexOfID(patronId)).checkInBook(books.get(findIndexOfISBN(isbn)));
                books.get(findIndexOfISBN(isbn)).setCheckedOut(false);
            }
        }
    }
    // Other methods...

    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
        if(){

        }
        else{
            System.out.println("No transactions found for ISBN: " + isbn);
        }
    }

    @Override
    public boolean checkoutBook(String isbn, String patronId) {
        int indexOfBook = findIndexOfISBN(isbn);
        int indexOfPatron = findIndexOfID(patronId);
        if(!books.get(indexOfBook).getCheckedOut()){
            books.get(indexOfBook).setCheckedOut(true);
            patrons.get(indexOfPatron).checkOutBook(books.get(indexOfBook));
            return true;
        }
        return false;
    }

    @Override
    public boolean checkinBook(String isbn, String patronId) {
        for(Transaction tran : transactions){
            if(tran.getIsbn().equals(isbn) && tran.getPatronId().equals(patronId)){


            }
        }
        return false;
    }

    // TODO: Complete the implementation of LibrarySystem methods
    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
   return null; }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
        return null;
    }

    @Override
    public Book searchBookByAuthor(String author) {
        return null;
    }

    public int findIndexOfISBN(String isbn) {
        int index = -1;
        for (int i =0; i < books.size()-1; i++){
            if (books.get(i).getIsbn().equals(isbn)) index = i;
        }
        return index;
    }
    public int findIndexOfID(String id) {
        int index = -1;
        for (int i =0; i < books.size()-1; i++){
            if (patrons.get(i).getPatronId().equals(id)) index = i;
        }
        return index;
    }


    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
