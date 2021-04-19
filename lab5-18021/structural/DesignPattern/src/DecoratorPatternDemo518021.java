public class DecoratorPatternDemo518021 {
    public static void main(String[] args) {
        Shape518021 circle = new Circle();
        Shape518021 redCircle = new RedShapeDecorator518021(new Circle());
        Shape518021 redRectangle = new RedShapeDecorator518021(new Rectangle518021());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}