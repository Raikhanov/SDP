import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<Character> characters = new ArrayList<>();
    private CharacterFactory characterFactory = new CharacterFactory();

    public void insertText(String text, String font, int size) {
        for (char ch : text.toCharArray()) {
            characters.add(characterFactory.getCharacter(ch, font, size));
        }
    }

    public void render() {
        int positionX = 0, positionY = 0;
        for (Character character : characters) {
            character.display(positionX, positionY);
            positionX += 10;
        }
    }
}
