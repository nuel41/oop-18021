public class AbstractFactoryPatternDemo218021 {
    public static void main(String[] args) {
        AbstractFactory218021 shapeFactory = FactoryProducer218021.getFactory(false);
        Shape218021 shape18021 = shapeFactory.getShape("RECTANGLE");
        shape18021.draw();
        Shape218021 shape218021 = shapeFactory.getShape("SQUARE");
        shape218021.draw();
        AbstractFactory218021 shapeFactory18021 = FactoryProducer218021.getFactory(true);
        Shape218021 shape3 = shapeFactory18021.getShape("RECTANGLE");
        shape3.draw();
        Shape218021 shape4 = shapeFactory18021.getShape("SQUARE");
        shape4.draw();
    }
}
   