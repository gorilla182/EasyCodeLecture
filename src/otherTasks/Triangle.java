package otherTasks;

public class Triangle extends Figure{
    protected Triangle(double side1, double side2,double side3) {
        super(side1,side2,side3);
    }
    protected Triangle(double side){
        super(side,side,side);
    }

    @Override
    public double perimetr() {
        return super.perimetr();
    }

    @Override
    public double area() {
        double per = perimetr();
        return Math.sqrt(per*(per-sides[0])*(per-sides[1])*(per-sides[2]));

    }
}
