package otherTasks;

public class FiguweFactory {
    public Figure create(double... sides){
        if(sides.length == 3){
            return new Triangle(sides[0],sides[1],sides[2]);
        } else if (sides.length == 2) {
            return new Rect(sides[0],sides[1]);
        } else
            throw new IllegalArgumentException("неверные аргументы");
    }
}
