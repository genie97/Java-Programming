package myPackage;

enum Suit{
    CLUBS("black"), DIAMONDS("red"), HEARTS("red"),
    SPADES("black");

    private final String color;

    private Suit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
