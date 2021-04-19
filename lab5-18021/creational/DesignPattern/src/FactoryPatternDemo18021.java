public class FactoryPatternDemo18021 {
    public static void main(String[] args) {
    ShapeFactory18021 shapeFactory = new ShapeFactory18021();
    Shape18021 shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();
    Shape18021 shape2 = shapeFactory.getShape("RECTANGLE");
    shape2.draw();
    Shape18021 shape3 = shapeFactory.getShape("SQUARE");
    shape3.draw();
    }
}