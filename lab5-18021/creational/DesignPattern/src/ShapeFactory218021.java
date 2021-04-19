public class ShapeFactory218021 extends AbstractFactory218021 {

    @Override
    public Shape218021 getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
        return new Rectangle218021();
    }else if(shapeType.equalsIgnoreCase("SQUARE")){
        return new Square18021();
    }
    return null;
    }
   }