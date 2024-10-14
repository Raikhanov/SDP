public abstract class MenuComponent {
    public String getName() { return ""; }
    public String getDescription() { return ""; }
    public double getPrice() { return 0.0; }
    public void add(MenuComponent menuComponent) { }
    public void remove(MenuComponent menuComponent) { }
    public void print() { }
}