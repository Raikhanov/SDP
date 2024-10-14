public class Character {
    private char value;
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void display(int positionX, int positionY) {
        System.out.println("Character: " + value + " at position (" + positionX + ", " + positionY + ") with font: " + font + " and size: " + size);
    }
}
