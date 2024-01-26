public class Point {
    // write code here

    private int x;
    private int y;

    // Constructors, methods, and other code will be added here



    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public double distance(Point point) {
        int xDiff = this.x - point.getX();
        int yDiff = this.y - point.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

}