package Q4.LibraryManagementLab.LibraryManagementLab;

public class Book extends Media implements Comparable{
    private String theAuthor;

    // TODO: Implement constructor (title, isbn, author); call super constructor
    public Book(String title, String isbn, String author){
        super(title, isbn);
        theAuthor = author;
    }

    public String getAuthor() { return theAuthor; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + theAuthor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book other) {
        return this.getTitle().compareTo(other.getTitle());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
