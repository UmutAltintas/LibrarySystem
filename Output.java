public class Output {
    public static final String WELCOME_MESSAGE = "Welcome to the Library Management System!";
    public static final String ENTER_CHOICE_LOGIN_OR_SIGNUP = "Please enter your choice: \n" +
                                                            "Login (l)\n" +
                                                            "Sign up (s)\n" +
                                                            "Quit (q)";
    public static final String BOOK_ADDED = "The book has been added successfully.";
    public static final String BOOK_NOT_FOUND = "Book not found.";
    public static final String EXIT_MESSAGE = "Exiting the system. Goodbye!";

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printFormatted(String message, Object... args) {
        System.out.printf(message + "%n", args);
    }
}
