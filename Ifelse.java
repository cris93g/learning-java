import java.io.Console;

public class Ifelse {
    public static void main(String[] args) {
        Console console = System.console();
        String age = console.readLine("How old are you? ");
        if (Integer.parseInt(age) < 14) {
            console.printf("lollllll");
            System.exit(0);
        } else {
            console.printf("cool");
        }
    }
}