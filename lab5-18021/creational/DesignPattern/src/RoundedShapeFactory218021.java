public class RoundedShapeFactory218021 extends AbstractFactory218021 {
     @Override
    public Shape218021 getShape(String shapeType){
    if(shapeType.equalsIgnoreCase("RECTANGLE")){
    return new RoundedRectangle218021();
    }else if(shapeType.equalsIgnoreCase("SQUARE")){
    return new RoundedSquare218021();
    }
    return null;
    }
}