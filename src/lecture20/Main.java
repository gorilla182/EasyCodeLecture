package lecture20;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(
                new Point(1,1),
                new Point(1,3),
                new Point(2,3),
                new Point(2,1));
        rect1.square();
    }
}
