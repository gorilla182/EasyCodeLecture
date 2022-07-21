package otherTasks;

public class Rect extends Figure{

    protected Rect(double sides1, double sides2) {
        super(sides1,sides2);
    }
    protected Rect(double side){
        super(side,side);
    }

    @Override
    public double area() {
        return sides[0]*sides[1];
    }
}
