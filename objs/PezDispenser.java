package objs;

class PezDispenser {
    public static final int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;

    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill() {
        fill(MAX_PEZ);
    }

    // if you add no args the top one will execute if you add 1 the bottom will exe
    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too many pezz!!!!!");
        }
        pezCount = newAmount;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public boolean dispense() {
        boolean wasDispense = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispense = true;
        }
        return wasDispense;
    }

    public String getCharacterName() {
        return characterName;
    }

}