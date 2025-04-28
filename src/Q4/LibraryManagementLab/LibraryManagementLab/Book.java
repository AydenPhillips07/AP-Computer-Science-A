package Q4.LibraryManagementLab.LibraryManagementLab;

public class Book extends Media {
    private String author;

    // TODO: Implement constructor (title, isbn, author); call super constructor
    public Book(String title, String isbn, String author){
        super(title, isbn);
        author = author;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
