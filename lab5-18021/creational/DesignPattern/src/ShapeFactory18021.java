public class ShapeFactory18021 {
    public Shape18021 getShape(String shapeType){
        if(shapeType == null){
        return null;
    }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle18021();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
    return new Rectangle18021();
    } else if(shapeType.equalsIgnoreCase("SQUARE")){
    return new Square18021();
    }
    return null;
   }
}