public class BridgePatternDemo218021 {
    public static void main(String[] args) {
    Shape218021 redCircle = new Circle218021(100, 100, 10, new RedCircle218021());
    Shape218021 greenCircle = new Circle218021(100, 100, 10, new GreenCircle218021());
    redCircle.draw();
    greenCircle.draw();
    }
}