import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookCatalog;
    ArrayList<User> userCatalog;

    public Library () {
        this.bookCatalog = new ArrayList<Book>();
        this.userCatalog = new ArrayList<User>();
    }

    public void searchBook (Book book) {}
    public void search (User user) {}
}
