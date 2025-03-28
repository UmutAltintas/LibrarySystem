public class User {
    private static int userCounter = 0;
    private int userId;
    private String name;
    private String email;
    private String password;
    private boolean hasAccess;

    public User (String name, String email, String password, boolean hasAccess) {
        this.userId = userCounter++;
        this.name = name;
        this.email = email;
        this.password = password;
        this.hasAccess = hasAccess;
    }

    public int getUserId () { return userId; }
    public String getName () { return name; }
    public String getEmail () { return email; }
    public String getPassword () { return password; }
    public boolean getAcces () { return hasAccess; }

    public void setName (String name) { this.name = name; }
    public void setEmail (String email) { this.email = email; }
    public void setPassword (String password) { this.password = password; }

    @Override
    public String toString () {
        return "User { ID = " + userId + ", Name = '" + name + "', Email = '" + email + "', Password = '" + password + "' }";
    }

}
