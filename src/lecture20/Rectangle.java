package lecture20;

public class Rectangle {
    private final int SIDE_A;
    private final int SIDE_B;
    private final int SIDE_C;
    private final int SIDE_D;

    public Rectangle (Point a, Point b, Point c, Point d){
        this(a.pointDistance(b),a.pointDistance(d),b.pointDistance(c),c.pointDistance(d));
    }

    public Rectangle(int side_a, int side_d, int side_b, int side_c) {
        if(side_a == side_c && side_b == side_d) {
            SIDE_A = side_a;
            SIDE_B = side_b;
            SIDE_C = side_c;
            SIDE_D = side_d;
        } else
            throw new IllegalArgumentException("Неверные аргументы");
    }
    private boolean isSquare (){
        return this.SIDE_A == this.SIDE_B && this.SIDE_A == this.SIDE_D && this.SIDE_A == this.SIDE_C;
    }
    public void square (){
        if(isSquare())
            System.out.println("Это квадрат");
        else
            System.out.println("Это не квадрат");
    }
}
