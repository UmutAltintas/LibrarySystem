import java.util.Scanner;

public class LibSystem {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        Scanner input = new Scanner(java.lang.System.in);

        Output.print(Output.WELCOME_MESSAGE);
        Output.print(Output.ENTER_CHOICE_LOGIN_OR_SIGNUP);
        String in = input.nextLine();
        if (in == "l") {
            Output.print(Output.ENTER_CHOICE_LOGIN_OR_SIGNUP);
        }

        boolean cont = true;
        while (cont) {
            cont = false;
        }
    }
}
