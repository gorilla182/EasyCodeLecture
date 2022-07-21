package otherTasks;

public abstract class Figure {
    protected final double [] sides;

    protected Figure(double... sides) {
        this.sides = sides;
    }
    public abstract double area ();

    public double perimetr(){
        double perimeter = 0;
        for(double side : sides){
            perimeter += side;
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Периметр: "+ perimetr()  + " Площадь: "+ area();
    }
}
