public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor areaCalculator = new AreaCalculator();

        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);
    }
}