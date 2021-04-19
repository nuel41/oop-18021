public class Circle218021 extends Shape218021 {
    private int x, y, radius;
    public Circle218021(int x, int y, int radius, DrawAPI218021 drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}