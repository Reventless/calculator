import java.util.Scanner;

public class Userinput {

    private static Scanner Scanner = new Scanner(System.in);

    public static int handleinput() {

        String decision = Scanner.nextLine();
        int option = Integer.parseInt(decision);
        return option;
    }
}
