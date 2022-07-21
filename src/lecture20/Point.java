package lecture20;

public class Point {
    private final int X;
    private final int Y;

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    public int pointDistance (Point other){
        return (int) Math.sqrt(((X- other.X)*(X-other.X)+(Y- other.Y)*(Y- other.Y)));
    }
}
