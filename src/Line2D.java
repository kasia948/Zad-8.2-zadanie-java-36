public class Line2D extends Shape2D  {
    private int x;
    private int y;

    public Line2D() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Line2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
