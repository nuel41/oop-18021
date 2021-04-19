public class FactoryProducer218021 {
    public static AbstractFactory218021 getFactory(boolean rounded){
    if(rounded){
    return new RoundedShapeFactory218021();
    }else{
    return new ShapeFactory218021();
    }
   }
}