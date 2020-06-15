import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        String firstName = console.readLine("what is your name? ");
        console.printf("Hello,my %s is christian\n", firstName);
        console.printf("%s is learning java", firstName);
    }
}