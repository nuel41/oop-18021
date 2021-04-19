public abstract class ShapeDecorator518021 implements Shape518021{
    protected Shape518021 decoratedShape;
    public ShapeDecorator518021(Shape518021 decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    public void draw() {
        decoratedShape.draw();
    }
}