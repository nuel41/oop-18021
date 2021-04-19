public class RedShapeDecorator518021 extends ShapeDecorator518021{
    public RedShapeDecorator518021(Shape518021 decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape518021 decoratedShape) {
        System.out.println("Border Color: Red");
    }
}