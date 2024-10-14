public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent mainMenu = new Menu("Main Menu", "All available dishes");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Sweet treats");

        MenuComponent pizza = new MenuItem("Pizza", "Delicious cheesy pizza", 9.99);
        MenuComponent cake = new MenuItem("Cake", "Chocolate cake", 4.99);

        mainMenu.add(pizza);
        dessertMenu.add(cake);
        mainMenu.add(dessertMenu);

        mainMenu.print();
    }
}
