import java.util.ArrayList;

public class ManagementSystem {
    public static void main(String[] args) {
        User u = new User("Deniz", "ds@mail.com", "123UD89");
        System.out.println(u);
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        Book b = new Book("heel", "hello", "bon", "ibon", a);
        System.out.println(b);
    }
}
