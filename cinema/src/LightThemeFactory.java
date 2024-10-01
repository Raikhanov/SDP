public class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }
}
