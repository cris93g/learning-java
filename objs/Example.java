package objs;

public class Example {
    public static void main(String[] args) {
        System.out.println("We are making a new paz dispenser");
        System.out.printf("fun fact: there are %d pez allowed in every deispenser", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Elsa");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        if (dispenser.isEmpty()) {
            System.out.println("dispenser is empty");
        }
        System.out.println("fillin the dispenser with Pez...");
        dispenser.fill();
        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }
        while (dispenser.dispense()) {
            System.out.println("chomp");
        }
        if (dispenser.isEmpty()) {
            System.out.println("ate them all");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("chomp");
        }
        try {
            dispenser.fill(400);
            System.out.println("this wont happen");
        } catch (IllegalArgumentException iae) {
            System.out.println("whoa there");
            System.out.printf("the error was %s", iae.getMessage());
        }
    }
}