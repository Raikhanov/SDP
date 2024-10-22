class AreaCalculator implements Visitor {
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Area of Circle: " + area);
    }

    public void visit(Rectangle rectangle) {
        double area = rectangle.getLength() * rectangle.getWidth();
        System.out.println("Area of Rectangle: " + area);
    }
}
