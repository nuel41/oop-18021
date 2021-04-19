public class PrototypePatternDemo518021 {
    public static void main(String[] args) {
    ShapeCache518021.loadCache();
    Shape518021 clonedShape = (Shape518021) ShapeCache518021.getShape("1");
    System.out.println("Shape : " + clonedShape.getType());
    Shape518021 clonedShape2 = (Shape518021) ShapeCache518021.getShape("2");
    System.out.println("Shape : " + clonedShape2.getType());
    Shape518021 clonedShape3 = (Shape518021) ShapeCache518021.getShape("3");
    System.out.println("Shape : " + clonedShape3.getType());
    }
}