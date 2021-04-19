public class ShapeCache518021 {
    private static Hashtable<String, Shape518021> shapeMap = new Hashtable<String, Shape518021>();
    public static Shape518021 getShape(String shapeId) {
        Shape518021 cachedShape = shapeMap.get(shapeId);
        return (Shape518021) cachedShape.clone();
    }
    public static void loadCache() {
        Circle518021 circle = new Circle518021();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Square518021 square = new Square518021();
        square.setId("2");
        shapeMap.put(square.getId(),square);
        Rectangle518021 rectangle = new Rectangle518021();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}