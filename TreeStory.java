import java.io.Console;

public class TreeStory {

    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("what is your name?");
        String adj = console.readLine("what is a adj");
        String noun = console.readLine("what is a noun");
        String adverb = console.readLine("what is a adverb");
        String verb = console.readLine("what is a verb");
        console.printf("%s is a %s %s  .\n They are always %s %s", name, adj, noun, adverb, verb);

    }

}