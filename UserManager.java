import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, String> users; // Stores username -> password

    public UserManager() {
        users = new HashMap<>();
    }

    public boolean signUp(String username, String password) {
        if (users.containsKey(username)) {
            Output.print("Username already exists. Please choose another one.");
            return false;
        }
        users.put(username, password);
        Output.print("Sign-up successful! You can now log in.");
        return true;
    }

    public boolean logIn(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            Output.print("Login successful. Welcome, " + username + "!");
            return true;
        } else {
            Output.print("Invalid username or password. Please try again.");
            return false;
        }
    }
}