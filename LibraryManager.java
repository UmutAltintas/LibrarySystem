import java.util.ArrayList;

public class LibraryManager {
    ArrayList<Book> bookCatalog;
    ArrayList<User> userCatalog;

    public LibraryManager() {
        this.bookCatalog = new ArrayList<Book>();
    }

    public void addBook (Book book) {
        bookCatalog.add(book);
    }

    public void searchBook (Book book) {}
}
