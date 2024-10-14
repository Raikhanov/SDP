public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.insertText("Hello AITU", "Arial", 12);
        editor.insertText("YEAR2024", "Arial", 12);
        editor.render();
    }
}
